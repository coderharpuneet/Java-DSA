import java.util.Scanner;

public class palindromePyramid {
    public static void main(String[] args) {
        int i,j,k,n,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(k);
            }
            for(z=i-1;z>=1;z--){
                System.out.print(z);
            }
            System.out.println();
        }
    }
}
