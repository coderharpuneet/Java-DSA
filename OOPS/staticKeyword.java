class Student{
    String name;
    int rollNo;
    int marks;
    static int numberOfStudents=0;
    public Student(String name,int rollNo,int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
        numberOfStudents++;
    }
}
public class staticKeyword {
    public static void main(String[] args) {
        Student s1=new Student("Harpuneet",7,93);
        System.out.println("Name: "+s1.name);
        System.out.println("Roll No: "+s1.rollNo);
        System.out.println("Marks: "+s1.marks);
        System.out.println("Number of students: "+Student.numberOfStudents);
        System.out.println();
        Student s2=new Student("Rajat",8,95);
        System.out.println("Name: "+s2.name);
        System.out.println("Roll No: "+s2.rollNo);
        System.out.println("Marks: "+s2.marks);
        System.out.println("Number of students: "+Student.numberOfStudents);
        System.out.println();
        
    }
}
