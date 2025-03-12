import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        for(int i=0;i<n;i++){
            if(n<=3){
                System.out.println("NO SOLUTION");
                break;
            }
            else{
                arr[0]=n-1;
                arr[n-1]=1;
                arr[(n-1)/2]=n;
                if(i<n/2 && i!=0 && i!=n-1 && i!=(n-1)/2){
                    arr[i]=i+1;
                }
                else if(i>n/2 && i!=0 && i!=n-1 && i!=(n-1)/2){
                    arr[i]=i;
                }

            }
        }
        if(n>3){
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
