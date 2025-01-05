import java.util.Scanner;

public class evenorOdd {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
