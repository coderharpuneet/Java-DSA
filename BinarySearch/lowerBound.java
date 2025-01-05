
public class lowerBound {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,40,50,60,70};
        int l=0;
        int n=arr.length;
        int h=n-1;
        int t=55;
        int lb=n;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]>=t){
                lb=Math.min(mid, lb);
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }        
        System.out.println("Lower bound is "+lb);

    }
}
