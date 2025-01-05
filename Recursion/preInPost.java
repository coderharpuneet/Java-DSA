import java.util.Scanner;

public class preInPost {
    public static void pip(int n){
        if(n==0) return;
        System.out.print("pre "+n+" ");
        pip(n-1);
        System.out.print("in "+n+" ");
        pip(n-1);
        System.out.print("post "+n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pip(n);
    }
}
