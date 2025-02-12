import java.util.Scanner;

public class ticTacToeOptimized {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }
        for(int i=0;i<n;i++){
            char first=arr[i][0];
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[i][j]==first){
                    cnt++;
                }
                if(cnt==n){
                    System.out.println(first+" wins");
                    return;
                }
            }
        }
        for(int i=0;i<n;i++){
            char first=arr[0][i];
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[j][i]==first){
                    cnt++;
                }
                if(cnt==n){
                    System.out.println(first+" wins");
                    return;
                }
            }
        }
        for(int i=0;i<n;i++){
            
                char first=arr[0][0],second=arr[0][n-1];
                int cntfirst=0,cntsecond=0;
                for(int j=0;j<n;j++){
                    if(arr[i][j]==first){
                        cntfirst++;
                    }
                    if(arr[i][n-j-1]==second){
                        cntsecond++;
                    }
                if(cntfirst==n || cntsecond==n){
                    System.out.println(first+first+" wins");
                    return;
                }
        }
        }
    }
}
