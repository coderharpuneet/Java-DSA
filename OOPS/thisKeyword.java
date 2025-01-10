class Student{
    private int rollNo;
    public void setRollNo(int rollNo){
        this.rollNo=rollNo; //this.rollNo refers to the attribute of the class.
    }
    public int getRollNo(){
        return rollNo;
    }
}
public class thisKeyword {
    public static void main(String[] args) {
        Student s=new Student();
        s.setRollNo(10);
        System.out.println(s.getRollNo());
    }
}
