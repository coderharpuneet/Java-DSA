public class gettersSetters {
    public static void main(String[] args) {
        Student s =new Student();
        s.setrNo(7);
        System.out.println(s.getrNo());        
    }
}
class Student{
    public String name;
    private int rNo;
    public int marks;

    //Getter: Getting the private member
    public int getrNo(){
        return rNo;
    }

    //Setter: Setting the private member
    public void setrNo(int rollNo){
        rNo=rollNo;
    }
}