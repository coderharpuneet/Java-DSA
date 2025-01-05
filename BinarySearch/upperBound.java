public class upperBound {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,40,50,60,70};
        int l=0;
        int n=arr.length;
        int h=n-1;
        int t=30;
        int ub=n;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]>t){
                ub=Math.min(mid, ub);
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }        
        System.out.println("Upper bound is "+ub);        
    }
}
