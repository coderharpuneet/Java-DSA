import java.util.Scanner;

public class AP2 {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int i;
        for(i=4;i<=3*n+1;i+=3){
            System.out.println(i);
        }
    }
}
