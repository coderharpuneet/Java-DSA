import java.util.Scanner;

public class initializaton {
    public static void main(String[] args) {
        int[] arr= new int[5];
        arr[0]=5;
        arr[1]=5;
        arr[2]=5;
        arr[3]=5;
        arr[4]=5;
        System.out.print(arr[0]);

        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        Scanner sc = new Scanner(System.in);
        //To take input of an array
        int[] array= new int[5];
        for(int j=0;j<5;j++){
            arr[j]=sc.nextInt();
        }
        for(int j=0;j<5;j++){
            System.out.println(arr[j]);
        }
    }
}
