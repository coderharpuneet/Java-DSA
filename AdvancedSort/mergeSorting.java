public class mergeSorting {
    public static void print(int[] arr) {

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void merge(int[] a,int[] b,int[] c) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            if(a[i]>b[j]) c[k++]=b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
    public static void mergesort(int[] arr) {
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        for (int i = 0; i < a.length; i++) {
            a[i]=arr[i];
        }
        for (int i = 0; i < b.length; i++) {
            b[i]=arr[i+n/2];
        }
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr={80,10,70,30,60,40,50,20};
        System.out.println("Before Sorting");
        
        print(arr);
        mergesort(arr);
        System.out.println("\nAfter Sorting");
        print(arr);
    }
}
