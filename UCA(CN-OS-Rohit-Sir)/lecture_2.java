
public class lecture_2 {
     static class CommonCounter{
          int count;
          public ReentrantLock lock;
          CommonCounter(){
               this.count=0;
               this.lock = new ReentrantLock();
          }
          // public synchronized void increment(){
          //      this.count+=1;
          // }
          public void  increment(){
               while(!lock.tryLock()){

               }
               this.count+=1;
               lock.unlock(); // Ensure to unlock after incrementing
          }
     }

     static class MyRunnable implements Runnable{
          CommonCounter resource;
          int n;
          MyRunnable(CommonCounter resource, int n) {
               this.resource = resource;
               this.n = n;
          }
          @Override
          public void run(){
               
               for(int i=0;i<n;i++){
                    resource.increment();
               }
          }
     }
     public static void main(String[] args) throws InterruptedException {
          CommonCounter counter = new CommonCounter();
          Thread thread1=new Thread(new MyRunnable(counter,10000000));
          Thread thread2=new Thread(new MyRunnable(counter,10000000));
          thread1.start();
          thread2.start();

          // Abhi jo answer aayega woh 10 aayega 20 nahi kyunki dono threads same resource ko access kar rahe hain bina kisi synchronization ke.
          // Agar dono threads ko alag alag resources diye jaaye toh answer 20 aayega.

          thread1.join();
          thread2.join();

          System.out.println("Final count: " + counter.count);
     }
}
