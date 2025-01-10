class Car{
    public String name;
    public int price;
    public int year;
    public Car(String name,int price,int year){
        this.name=name;
        this.price=price;
        this.year=year;
    }
}
public class constructors {
    public static void main(String[] args) {
        Car c = new Car("Fortuner", 5500000,2024);
        System.out.println("Name: "+c.name);
        System.out.println("Price: "+c.price);
        System.out.println("Year: "+c.year);
    }
}
