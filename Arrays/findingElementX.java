import java.util.Scanner;

public class findingElementX {
    public static void main(String[] args) {
        int x;
        int[] arr= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        x=sc.nextInt();
        int flag=0;
        for(int j=0;j<5;j++){
            if (arr[j]==x) {
                System.out.println(x+" exists in the array at position "+(j+1));
                flag=0;
                break;
            }
            else{
                flag=1;
            }
        }
        if(flag==1){
            System.out.println(x+" does not exist in the array");
        }

    }
}
