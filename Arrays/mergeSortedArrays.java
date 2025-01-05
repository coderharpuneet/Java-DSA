public class mergeSortedArrays {
    public static void main(String[] args) {
        int[] a = {11, 31, 41, 71, 99};
        int[] b = {21, 51, 61, 81, 91};
        int n=a.length+b.length;
        int[] c = new int[n];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else {
                c[k]=b[j];
                j++;
                k++;
            }
            
        }
        if(i==a.length){
            while (j<b.length) {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        else{
            while (i<a.length) {
                c[k]=a[i];
                i++;
                k++;
            }
        }
        
        for(int ele : c){
            System.out.print(ele+" ");
        }
    }
}
