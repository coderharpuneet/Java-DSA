import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {
        int n;
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int z=1;z<=n-1;z++){
            for(int j=1;j<=z;j++){
                System.out.print(" ");
            }
            for(int k= 2*(n-z)-1;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
