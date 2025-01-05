import java.util.Scanner;

public class BShw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int target = scanner.nextInt();
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        System.out.println("Element not found");
    }
}