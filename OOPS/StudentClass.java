public class StudentClass {
    public static class Student{
        String name;
        int rollNo;
        double percent;
    }
    public static void main(String[] args) {
        Student x = new Student(); //Declaration
        x.name="Harpuneet";
        x.rollNo=7;
        x.percent=93.5;
        System.out.println("Name: "+x.name);
        System.out.println("Roll No: "+x.rollNo);
        System.out.println("Percentage: "+x.percent);

        Student y= new Student();
    }
}
