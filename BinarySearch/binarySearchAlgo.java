import java.util.Scanner;

public class binarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int n=arr.length;
        int l=0;
        int h=n-1;
        boolean flag=false;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]<target){
                l=mid+1;
            }
            else if(arr[mid]>target){
                h=mid-1;
            }
            else if(arr[mid]==target){
                System.out.println("Target element is at "+(mid+1)+" position");
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Target elemment is not present in the array");
        }
    }
}
