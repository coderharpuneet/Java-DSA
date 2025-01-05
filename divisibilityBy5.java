import java.util.Scanner;

public class divisibilityBy5 {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        if(num%5==0){
            System.out.println(num+" is divisible by 5");
        }
        else {
            System.out.println(num+" is not divisible by 5");
            }
    }
}
