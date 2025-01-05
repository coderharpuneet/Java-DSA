import java.util.Scanner;

public class mixTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int i,j;
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(i%2==0) System.out.print((char)(j+64));
                else System.out.print(j);
            }
            System.out.println();
        }
    }
}
