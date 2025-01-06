public class oopsTwo {
    public static void main(String[] args) {
        Student s1= new Student("Harpuneet","#366,Phase 11 Mohali",18,93,'O');
        s1.display();
    }
}
class Person{
    public String name;
    public String address;
    public int age;
}
class Student extends Person{
    public int marks;
    public char grade;
    Student(String name,String address,int age,int marks,char grade){
        this.name=name;
        this.address=address;
        this.age=age;
        this.marks=marks;
        this.grade=grade;
    }
    public void display(){
        System.out.println("Name    is :: "+name);
        System.out.println("Address is :: "+address);
        System.out.println("Age     is :: "+age);
        System.out.println("Marks   are :: "+marks);
        System.out.println("Grade   is :: "+grade);
    }
}
