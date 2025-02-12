import java.util.Scanner;

public class findingzero {
    public static void main(String[] args) {
        int[][]arr=new int[3][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<2;i++){
            
            for (int j = 1; j < 3; j++) {
                if(arr[i][j]==0 && arr[i-1][j]==1 && arr[i][j+1]==1 && arr[i+1][j]==1 && arr[i][j-1]==1){
                    System.out.println(i+" "+j);
                }
            }
        }

    }
}
