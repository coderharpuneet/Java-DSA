import java.util.Scanner;

public class indexOfCompareTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = str.indexOf(" ");
        System.out.println(index);




        String a ="abc";
        String b= "dbc";
        System.out.println(a.compareTo(b));
    }
}
