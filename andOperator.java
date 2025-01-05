import java.util.Scanner;

public class andOperator {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        if(n>99 && n<1000) System.out.println("It is a three digit number");
        else System.out.println("It is not a three digit Number.");
    }
}
