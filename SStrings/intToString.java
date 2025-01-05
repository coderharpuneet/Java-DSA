import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String str = "";
        str= num+str;
        System.out.println("The number as a string is: "+str);
        String age=sc.nextLine();
    }
}
