import java.util.Scanner;

class Square{
    void sq(int n){
        System.out.println("The square of "+n+" is: "+(n*n));
    } 
}
public class squaresOfn {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter the number to be squared: ");
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        Square s = new Square();
        s.sq(num);
    }
}
