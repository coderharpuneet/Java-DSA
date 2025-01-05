import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        int a,b,c;
        int l;
        int d;
        int i;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the A.P.: ");
        n = sc.nextInt();
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        for(i=1;i<2*n-1;i+=2){
            System.out.println(i);
        }
    }
}
