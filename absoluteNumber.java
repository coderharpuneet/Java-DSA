import java.util.Scanner;

public class absoluteNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if(num<0){
            System.out.println(-num);
        }
        else{
            System.out.println(num);
        }
    }
}
