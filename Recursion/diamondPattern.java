import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        num = scanner.nextInt();
        for(int i=0;i<num;i++) {
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=2*i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=2*num-1;k>2*i;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}