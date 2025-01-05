import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int a;
        System.out.print("Enter the first number of GP: ");
        a= sc.nextInt();
        int d,i;
        System.out.print("Enter the common ratio of GP: ");
        d = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(a);
            a*=d;
        }
    }
}
