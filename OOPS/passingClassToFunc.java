public class passingClassToFunc {
    public static class Student{
        String name;
        int rollNo;
        int marks;
    }
    public static void change(Student x){
        x.name="Sidak";
    }
    public static void main(String[] args) {
        Student x=new Student();
        x.name="Harpuneet";
        System.out.println("Name before change: "+x.name);
        change(x);
        System.out.println("Name after change: "+x.name);
    }
}
