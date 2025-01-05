import java.util.Scanner;

public class starCross {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)==(n+1)|| i==j) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
