import java.util.Scanner;

public class increasingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Long[] arr=new Long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long count=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                long diff=arr[i-1]-arr[i];
                arr[i]+=diff;
                count+=diff;
            }
        }
        System.out.println(count);
    }
}
