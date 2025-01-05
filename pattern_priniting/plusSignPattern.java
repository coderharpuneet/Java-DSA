import java.util.Scanner;

public class plusSignPattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==(n+1)/2 || j==(n+1)/2) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
