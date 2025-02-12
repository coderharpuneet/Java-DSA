public class mergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8};
        int n=arr1.length;
        int m=arr2.length;
        int[] arr3 = new int[n+m];
        int i=0,j=0,k=0;
        while(i<arr1.length &&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(i==arr1.length){
            while(j<arr2.length){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        else{
            while(i<arr1.length){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
        }
        for(int x=0;x<arr3.length;x++){
            System.out.print(arr3[x]+" ");
        }
    }
}
