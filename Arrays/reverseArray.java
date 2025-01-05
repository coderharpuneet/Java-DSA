public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i=0;i<5/2;i++){
            arr[i]=arr[i]+arr[4-i];
            arr[4-i]=arr[i]-arr[4-i];
            arr[i]=arr[i]-arr[4-i];
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
