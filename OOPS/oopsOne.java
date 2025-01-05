public class oopsOne {
    public static void main(String[] args) {
        Employees Emp1=new Employees();
        Emp1.setData("007","Harpuneet Singh",18,"#366,Phase 11,Mohali");
        Emp1.getData();
    }
}
class Employees{
    private String id;
    private String name;
    private int age;
    private String address;
    
    public void setData(String id,String name,int age,String address){
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public void getData(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
}