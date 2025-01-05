import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int num;
        Scanner sc=new  Scanner(System.in);
        int rev=0;
        int r;
        System.out.println("Enter the number");
        num=sc.nextInt();
        System.out.println(num);
        while(num>0){
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println(rev);
    }
}
