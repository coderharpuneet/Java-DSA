import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        int num;
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        i = num;
        int rev;
        int sum=0;
        while(num>0){
            rev=num%10;
            sum+=rev;
            num/=10;
        }
        System.out.print("Sum of digits of the number "+i+": "+sum);
    }
}
