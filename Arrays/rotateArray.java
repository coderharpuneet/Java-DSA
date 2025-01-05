public class rotateArray {
    public static int [] reverse(int arr[],int i,int j){
        
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr= {10,20,30,40,50,60,70,80,90};
        int n=arr.length;
        int k=5;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr, n-k,n-1);
        reverse(arr, 0, n-1);
        for(int z=0;z<n;z++){
            System.out.print(arr[z]+" ");
        }

    }
}
