class Student{
    String name;
    int rollNo;
    int marks;
}
public class defaultValuesOfattr {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name); //null
        System.out.println(s.rollNo); //0
        System.out.println(s.marks); //0
    }
}
