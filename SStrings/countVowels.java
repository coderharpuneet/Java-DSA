
import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        int n=name.length();
        int count=0;
        for(int i=0;i<n;i++){
            char ch= name.charAt(i);
            if(isVowel(ch)==true){
                count++;
            }
        }
        System.out.println("The number of vowels in the string are: "+count);
    }
    public static boolean isVowel(char ch){
        if(ch=='a'||
            ch=='e'||
            ch=='i'||
            ch=='o'||
            ch=='u'||
            ch=='A'||
            ch=='E'||
            ch=='I'||
            ch=='O'||
            ch=='U'
        ){
            return true;
        }
        else{
            return false;
        }
    }
}
