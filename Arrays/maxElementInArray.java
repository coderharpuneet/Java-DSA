import java.util.Scanner;

public class maxElementInArray {
    public static void main(String[] args) {
         int[] arr= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array is: "+max);
    }
}
