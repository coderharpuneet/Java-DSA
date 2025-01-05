

// Write a program to store 10 at every index of a 2D matrix with 5 rows and 5 columns.

public class quesOne {
    public static void main(String[] args) {
        int [][] arr= new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=10;
            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
