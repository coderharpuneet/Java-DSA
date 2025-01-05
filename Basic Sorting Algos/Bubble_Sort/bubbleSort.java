public class bubbleSort {
    public static void printArr(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        int n= arr.length;
        /*---------- Bubble Sort 1 ----------- */
        // for(int x=0;x<n-1;x++){
        //     for(int i=0;i<n-1;i++){
        //         if(arr[i]>arr[i+1]){
        //             int temp=arr[i];
        //             arr[i]=arr[i+1];
        //             arr[i+1]=temp;
        //         }
        //     }
        // }

        /*---------- Bubble Sort 2 ---------- */
        // for(int x=0;x<n-1;x++){
        //     for(int i=0;i<n-1-x;i++){
        //         if(arr[i]>arr[i+1]){
        //             int temp=arr[i];
        //             arr[i]=arr[i+1];
        //             arr[i+1]=temp;
        //         }
        //     }
        // }

        /*---------- Optimized Bubble Sort ---------- */
        for(int x=0;x<n-1;x++){
            for(int i=0;i<n-1-x;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            boolean flag =true;
            for(int i=0;i<n-1-x;i++){
                if(arr[i]>arr[i+1]){
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        printArr(arr);
    }
}
