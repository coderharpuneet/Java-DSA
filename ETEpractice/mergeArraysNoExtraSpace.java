import java.util.Arrays;

public class mergeArraysNoExtraSpace {
    public static void main(String[] args) {
        int[] arr1 = {1,5,9,10,15,20};
        int[] arr2 = {2,3,8,13};
        int n = arr1.length;
        int m = arr2.length;
        int i=n-1,j=0;
        while(i>=0 && j<m){
            if(arr1[i]>arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
            }
            j++;
            
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int k=0;k<n;k++){
            System.out.print(arr1[k]+" ");
        }
        System.out.println();
        for(int k=0;k<m;k++){
            System.out.print(arr2[k]+" ");
        }
    }
}
