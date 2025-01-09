public class classInsideMain {
    public static void main(String[] args) {
        class Student{ //No need to write public static.  
            String name;
            int rollNo;
            double percent; 
        }
        Student x=new Student();
        x.name="Harpuneet";
        x.rollNo=7;
        x.percent=93.5;
        System.out.println("Name: "+x.name);
        System.out.println("Roll No.: "+x.rollNo);
        System.out.println("Percentage: "+x.percent);
    }
}
