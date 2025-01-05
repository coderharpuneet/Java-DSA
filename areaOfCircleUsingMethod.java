import java.util.Scanner;
class circle{
    double area(double rad){
        double Area=3.14*rad*rad;
        return Area;
    }
}

public interface areaOfCircleUsingMethod {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        r=sc.nextInt();
        circle c= new circle();
        double ar=c.area(r);
        System.out.println("Area of circle with radius "+r+" is: "+ar);

    }
}
