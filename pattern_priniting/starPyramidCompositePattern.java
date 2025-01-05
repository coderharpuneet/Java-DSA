import java.util.Scanner;

public class starPyramidCompositePattern {
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner sc = new Scanner (System.in);
        n= sc.nextInt();
        for(i=1;i<=n;i++)
        {
            int a=1;
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                 System.out.print("*");
            }
            System.out.println();
        }
}
}
