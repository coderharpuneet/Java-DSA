import java.util.Scanner;

public class tableOf19 {
    public static void main(String[] args) {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        for(i=0;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
