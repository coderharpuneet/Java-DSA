import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        char [] ch= s.toCharArray();
        char [] chr= t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(chr);
        if(ch.equals(chr)){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }

    }
}
