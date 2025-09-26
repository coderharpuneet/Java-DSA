public class lecture_1 {
     public static void main(String[] args) {
          Thread thread=new Thread();
          
          Thread t1=new Thread(() -> { // Lambda Expression
               for (int i = 0; i < 5; i++) {
                    System.out.println("Hello " + i);
               }
               System.out.println(Thread.currentThread().getName());
          });
          t1.setName("Harpuneet");

          t1.start();
          // t1.run();
          System.out.println(Thread.currentThread().getName());
     }
}
