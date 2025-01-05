import java.util.Scanner;

public class sumofDigits {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num=649;
        int r,sum=0;
            while(num>0||sum>9){
                if(num==0){
                    num=sum;
                    sum=0;
                }
                r=num%10;
                sum+=r;
                num=num/10;
            }
        System.out.println(sum);
    }
}
