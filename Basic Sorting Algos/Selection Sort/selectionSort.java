public class selectionSort {
    public static void printArr(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int min =Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            //Swap i and mindx element
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        printArr(arr);
    }    
}
