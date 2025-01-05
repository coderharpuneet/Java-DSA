import java.util.Scanner;

public class numberOfditisInANumber {
    public static void main(String[] args) {
        int num;
        int i;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Number: ");
        num = sc.nextInt();
        i=num;
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.println("Number of digits in "+i+": "+count);
    }
}
