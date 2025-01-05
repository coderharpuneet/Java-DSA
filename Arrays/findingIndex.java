import java.util.Scanner;

public class findingIndex {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=35){
                System.out.println(i);
            }
        }
    }
}
