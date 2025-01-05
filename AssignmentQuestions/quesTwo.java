// Write a program to add two matrices and save the result in one of the given matrices.
public class quesTwo {
    public static void main(String[] args) {
        int [][] a= new int[3][3];
        int [][] b= new int[3][3];
        int [][] c= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
