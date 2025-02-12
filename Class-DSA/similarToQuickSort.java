import java.util.Scanner;
public class similarToQuickSort {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        int lo=0;
        int hi=n-1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=sc.nextInt();
        swap(arr, lo, index);
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
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }
}