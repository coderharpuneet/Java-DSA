class Car{
    public String name;
    public int price;
    public int year;
    final String company="Toyota";
    public Car(String name,int price,int year){
        this.name=name;
        this.price=price;
        this.year=year;
    }
}
public class finalKeyword {
    public static void main(String[] args) {
        Car c1=new Car("Fortuner",5500000,2024);
        //c1.company="Ford"; //Error: Cannot modify final variable 'company'
        System.out.println("Car 1 details: ");
        System.out.println("Name: "+c1.name);
        System.out.println("Price: "+c1.price);
        System.out.println("Year: "+c1.year);
        System.out.println("Company: "+c1.company);
        System.out.println();
        Car c2=new Car("Innova",2500000,2024);

        System.out.println("Car 2 details: ");
        System.out.println("Name: "+c2.name);
        System.out.println("Price: "+c2.price);
        System.out.println("Year: "+c2.year);
        System.out.println("Company: "+c2.company);
    }
}
