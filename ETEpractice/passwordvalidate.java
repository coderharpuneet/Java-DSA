import java.util.Scanner;
import java.util.regex.Pattern;

public class passwordvalidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password=sc.nextLine();
        if(Pattern.matches("[a-zA-Z0-9]+", password)){
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
