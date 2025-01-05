public class matrixPrintingInSpiralForm {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length;
        int n = arr[0].length;
        int minr = 0; 
        int minc = 0; 
        int maxr = m - 1; 
        int maxc = n - 1; 
        while(minr<=maxr && minc<=maxc){
            for(int i=minc;i<=maxc;i++){
                System.out.print(arr[minr][i]+" ");
            }
            minr++;0
            if(minr>maxr || minc>maxc){
                break;
            }
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;
            if(minr>maxr || minc>maxc){
                break;
            }
            for(int i=maxc;i>=minc;i--){
                System.out.print(arr[maxr][i]+" ");
            }
            maxr--;
            if(minr>maxr || minc>maxc){
                break;
            }
            for(int i=maxr;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
            }
            minc++;

        }
    }
}
