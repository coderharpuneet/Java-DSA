public class qs {
    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int[] arr , int lo,int hi){
        int pivot=arr[lo];
        int pivotIndex=lo;
        int scount=0;
        for (int i = lo+1; i <=  hi; i++) {
            if(arr[i]<=pivot ) scount++;
        }
        int correctIndex=pivotIndex+scount;
        swap(arr,pivotIndex,correctIndex);
        int i=lo,j=hi;
        while(i<correctIndex && j>correctIndex){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctIndex;
    }

    public static void quicksort(int[] arr, int lo, int hi) {
        if(lo>=hi) return;
        int idx=partition(arr,lo,hi);
        quicksort(arr,lo,idx-1);
        quicksort(arr,idx+1,hi);
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={4,9,7,1,3,2,6,5,8};
        int n = arr.length;
        quicksort(arr, 0, n-1);
        print(arr);
    }
}
