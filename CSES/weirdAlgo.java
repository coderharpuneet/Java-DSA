import java.util.Scanner;

public class weirdAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.print(n+" ");
        while(n!=1){
            if(n%2!=0){
                n=3 * n + 1;
            }
            else{
                n/=2;
            }
            System.out.print(n+" ");
        }
        sc.close();
    }
}
