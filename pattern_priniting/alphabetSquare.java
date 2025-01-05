import java.util.Scanner;

public class alphabetSquare {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int i,j;
        for(i=1;i<n;i++){
            for(j=1;j<=n;j++){
                char k=(char)(64+j);
                System.out.print(k);
        }
        System.out.println();
    }
}
}