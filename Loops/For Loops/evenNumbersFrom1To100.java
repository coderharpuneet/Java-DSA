import java.util.Scanner;

public class evenNumbersFrom1To100 {
    public static void main(String[] args) {
        int i;
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0)
            System.out.println(i);
        }
    }
}
