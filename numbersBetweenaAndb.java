import java.util.Scanner;
class num{
    void bet(int x,int y){
        int i;
        for(i=x;i<=y;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
public class numbersBetweenaAndb {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        a=sc.nextInt();
        System.out.print("Enter the second number");
        b=sc.nextInt();
        num n= new num();
        n.bet(a,b);
       
    }
}