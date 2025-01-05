public class arrayTraversal {
    public static void traverse(int i, int[] arr) {
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        traverse(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        traverse(0,arr);
    }
}
