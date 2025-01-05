import java.util.Scanner;

public class productOfAllElementsOfAnArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }
        int product = 1;
        for(int i=0;i<5;i++){
            product*=arr[i];
        }
        System.out.println(product);
    }
}
