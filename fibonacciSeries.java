import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        int n;
        int a=0,b=1;
        int c;
        System.out.print("Enter the number of terms to be printed");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        c=a+b;
        System.out.print(c+" ");
        for(int i=1;i<=(n-3);i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+" ");
        }

    }
}
