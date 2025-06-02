import java.lang.reflect.Array;
import java.util.ArrayList;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for (int j = i; j < arr.length; j++) {
        //         sum+=arr[j];
        //         max=Math.max(sum,max);
        //     }
        // }
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        ArrayList<Integer> subArray = new ArrayList<>();
        int ansStart=-1;
        int ansEnd=-1;
        int start=-1;
        for(int i=0;i<n;i++){
            if(currSum==0) start=i;
            currSum+=arr[i];
            if(currSum>maxSum){
                ansStart=start;
                ansEnd=i;
            }
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
        for(int i=ansStart;i<=ansEnd;i++){
            subArray.add(arr[i]);
        }
        System.out.println("The maximum subarray sum is: " + maxSum);
        System.out.print("The subarray with the maximum sum is: ");
        for(int i=0;i<subArray.size();i++){
            System.out.print(subArray.get(i) + " ");
        }
    }
}
