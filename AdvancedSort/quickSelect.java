public class quickSelect {
    static int ans;
    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr,int lo,int hi){
        int pivot=arr[lo];
        int pivotIndex=lo;
        int scount=0;
        for (int i = lo+1; i <= hi; i++) {
            if(arr[i]<=pivot) scount++;
        }
        int correctIndex=lo+scount;
        swap(arr,pivotIndex,correctIndex);
        int i=lo,j=hi;
        while(i<correctIndex && j>correctIndex) {
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
                i++;j--;
            }
        }
        return correctIndex;
    }
    public static void quickSelect(int[] arr,int lo,int hi,int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo==k-1) ans=arr[lo];
            return;
        }
        int idx=partition(arr,lo,hi);
        if(idx==k-1){
            ans=arr[idx];
            return;
        } 
        if(k-1<idx) quickSelect(arr,lo,idx-1,k);
        else quickSelect(arr,idx+1,hi,k);
    }
    public static void main(String[] args) {
        int[] arr={4,9,5,3,6,1,7,2,8};
        int n = arr.length;
        int k=1;
        ans=-1;
        quickSelect(arr, 0, n-1, k);
        
        System.out.println(ans);
    }
}
