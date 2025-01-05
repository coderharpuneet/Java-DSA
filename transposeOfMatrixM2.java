public class transposeOfMatrixM2 {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;
        int temp;
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        
        for (int i=0;i<m;i++){
            int a=0;
            int b=m-1;
            while(a<b ){
                temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
