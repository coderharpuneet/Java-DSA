import java.util.Scanner;

public class printNumbersFrim1ToN {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }    
}
