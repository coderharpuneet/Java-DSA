public class sortZerosAndOnes {
    public static void main(String[] args) {
        int[] arr={1, 0, 0, 1, 1, 1, 0, 0, 1, 0};
        int noOfZeros=0;
        int noOfOnes=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                noOfZeros++;
            }
            if(arr[i]==1){
                noOfOnes++;
            }
        }
        for(int i=0;i<noOfZeros;i++){
            arr[i]=0;
        }
        for(int i=noOfZeros;i<arr.length;i++){
            arr[i]=1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
