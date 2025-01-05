import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        long l=0;
        long h=x;
        while(l<=h){
            long mid=l+(h-l)/2;
            if(mid*mid==(long)x) System.out.println(mid);
            else if(mid*mid>x) h=mid-1;
            else if(mid*mid<x) l=mid+1;
        }
    }
}
