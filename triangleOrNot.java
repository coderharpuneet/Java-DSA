import java.util.Scanner;

public class triangleOrNot {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first side: ");
        a = sc.nextInt();
        System.out.println("Enter the value of second side: ");
        b = sc.nextInt();
        System.out.println("Enter the value of third side: ");
        c = sc.nextInt();
        if((a+b)>c && (b+c)>a && (a+c)>b) System.out.println("Valid Triangle");
        else System.out.println("Not a triangle.");
    }
}
