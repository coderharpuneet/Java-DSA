import java.util.Scanner;

public class sumofNumbersUsingScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a= sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of a and b is : "+sum);
    }
}
