import java.util.Scanner;
public class ticTacToe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }
        int ocount=0;
        int xcount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]=='O'){
                    ocount++;
                }
                if(arr[i][j]=='X'){
                    xcount++;
                }
            }
        }
        if(ocount<(n*n)/2 || xcount<(n*n)/2){
            System.out.println("Invalid Input");
            return;
        }
        for(int i=0;i<n;i++){
            boolean xflag=true;
            boolean oflag=true;
            for(int j=0;j<n;j++){
                if(arr[i][j]!='O'){
                    oflag=false;
                }
                if(arr[i][j]!='X'){
                    xflag=false;
                }
            }
            if(oflag==true){
                System.out.println("O wins");
                return;
            }
            if(xflag==true){
                System.out.println("X wins");
                return;
            }
        }
        boolean flag=false;
        for(int i=0; i<n;i++){
            if(arr[i][i]=='O'){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("O wins");
            return;
        }
        boolean pflag=false;
        for(int i=0; i<n;i++){
            if(arr[i][i]=='X'){
                pflag=true;
            }
            else{
                pflag=false;
                break;
            }
        }
        if(pflag==true){
            System.out.println("X wins");
            return;
        }
        boolean sflag=false;
        for(int i=0; i<n;i++){
            if(arr[i][n-i-1]=='O'){
                sflag=true;
            }
            else{
                sflag=false;
                break;
            }
        }
        if(sflag==true){
            System.out.println("O wins");
            return;
        }
        boolean fflag=false;
        for(int i=0; i<n;i++){
            if(arr[i][n-i-1]=='X'){
                fflag=true;
            }
            else{
                fflag=false;
                break;
            }
        }
        if(fflag==true){
            System.out.println("X wins");
            return;
        }
}
}