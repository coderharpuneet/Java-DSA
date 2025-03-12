import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long sum=0;
        long[] arr=new long[(int)n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        long arrsum=0;
        for(int i=0;i<n-1;i++){
            arrsum+=arr[i];
        }
        System.out.println(sum-arrsum);
    }
}
