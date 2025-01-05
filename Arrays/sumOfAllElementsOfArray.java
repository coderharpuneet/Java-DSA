import java.util.Scanner;

public class sumOfAllElementsOfArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length-1;i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
