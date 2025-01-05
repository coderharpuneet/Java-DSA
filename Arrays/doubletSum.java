import java.util.Scanner;

public class doubletSum {
    public static void main(String[] args) {
        int [] arr= new int[5];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sum you want: ");
        n=sc.nextInt();
        System.out.println("ENter the elements of the array: ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
            for(int j=i+1;j<5;j++){
                if(arr[i]+arr[j]==n){
                    System.out.println(arr[i]+" + "+arr[j]+"= "+n);
                    break;
                }
            }
        }

    }
}
