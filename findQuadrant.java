import java.util.Scanner;

public class findQuadrant {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println();
        System.out.print("Enter the value of y: ");
        y = sc.nextInt();
        if(x>0&&y>0) System.out.println("1st Quadrant");
        else if (x<0 && y>0) System.out.println("2nd Quadrant");
        else if (x<0 && y<0) System.out.println("3rd Quadrant");
        else if(x>0 && y<0) System.out.println("4th Quadrant");
        else System.out.println("Origin");
    }
}
