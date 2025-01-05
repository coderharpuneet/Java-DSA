public class nextGreatestElement {
    public static void main(String[] args) {
        int [] arr={12,8,41,37,2,49,16,28,21};
        int n=arr.length;
        int[] res = new int [n];
        res[n-1]=-1;
        int max=arr[n-1];
        // Method 1 
        // for(int i=0;i<n-1;i++){
        //     int max=0;
        //     for(int j=i+1;j<n;j++){
        //         max = Math.max(max, arr[j]);
        //     }
        //     res[i]=max;
        // }

        // Method 2.

        for(int i=n-2;i>=0;i--){
            
            res[i]=max;
            max=Math.max(max, arr[i]);
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele : res){
            System.out.print(ele+" ");
        }
    }
}
