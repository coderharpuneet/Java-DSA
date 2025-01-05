import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int num;
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        num= sc.nextInt();
        i=num;
        int rev=0,r;
        while(num>0){
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        if(i==rev) System.out.println("Palindrome");
        else System.out.println("Not a Plaindrome.");
    }
}
