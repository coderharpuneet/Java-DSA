import java.util.Scanner;

public class numberBridge {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n= sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            int a=1;
            System.out.print(a);
            a++;
        }
        System.out.println();
        for(int i=1;i<=n-1;i++){
            int a=1;
            for(int j=n-1;j>=i;j--){
                System.out.print(a);
                a++;
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" ");
                a++;
           }
            for(int j=n-1;j>=i;j--){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
