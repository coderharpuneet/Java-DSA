import java.util.Scanner;

public class floydsTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int i,j;
        n = sc.nextInt();
        int a=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
