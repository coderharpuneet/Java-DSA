import java.util.regex.Pattern;

public class regexPrac1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[abc]","a")); // false Sirf a,b ya c mein se hi hona chahiye tha agar yahan sirf ek a,b ya c hota toh true hota. "ab" ke liye bhi false dega
        System.out.println(Pattern.matches("[^abc]","x")); // true Sirf a,b ya c ke alawa koi bhi character ho toh true dega. Yahan x hai jo a,b ya c nahi hai toh true dega.
        System.out.println(Pattern.matches("[a-zA-Z]", "aa")); // false Sirf ek character hona chahiye tha, yahan do characters hain toh false dega.
        System.out.println(Pattern.matches("[a-e[m-u]]","c")); // true Yahan c a se e ya m se u ke beech mein hai, toh true dega.
        System.out.println(Pattern.matches("[a-z && c-e]","d")); // true Yahan d c se e ke beech mein hai, toh true dega.
        System.out.println(Pattern.matches("[a-z && [^abcd]]","a")); // false Yahan a ko exclude kiya gaya hai, toh a ke liye false dega. Sirf b se z tak characters honge.
        System.out.println(Pattern.matches("[a-z && [^a-d]]","a")); // false Yahan a ko exclude kiya gaya hai, toh a ke liye false dega. Sirf b se z tak characters honge.




        System.out.println(Pattern.matches("[abc]?","abc")); // false Yahan ? ka matlab hai ki a, b, ya c mein se koi bhi character ho sakta hai, lekin yahan "abc" hai jo 3 characters hain, toh false dega.
        System.out.println(Pattern.matches("[abc]?","a")); // true Yahan ? ka matlab hai ki a, b, ya c mein se koi bhi character ho sakta hai, aur yahan "a" hai jo valid hai, toh true dega.

        System.err.println(Pattern.matches("[abc]+","abcd")); //false [abc]+ ka matlab hai: ek ya zyada a, b, ya c (sirf inhi characters ka combination allowed hai).
        System.err.println(Pattern.matches("[abc]+","abccaaab")); // true [abc]+ ka matlab hai: ek ya zyada a, b, ya c (sirf inhi characters ka combination allowed hai). Yahan "a" hai jo valid hai, toh true dega.

        System.out.println(Pattern.matches("[abc]*","abc" ));// true [abc]* ka matlab hai: zero ya zyada a, b, ya c (sirf inhi characters ka combination allowed hai). Yahan "abc" hai jo valid hai, toh true dega.
        System.out.println(Pattern.matches("[abc]*","")); // true [abc]* ka matlab hai: zero ya zyada a, b, ya c (sirf inhi characters ka combination allowed hai). Yahan empty string hai, toh true dega.
        System.out.println(Pattern.matches("[abc]*","hhhh")); // false [abc]* ka matlab hai: zero ya zyada a, b, ya c (sirf inhi characters ka combination allowed hai). Yahan "hhhh" hai jo a, b, ya c nahi hai, toh false dega.

        System.out.println(Pattern.matches("[a-z]{4}","abcd")); // true [a-z]{4} ka matlab hai: exactly 4 characters honi chahiye jo a se z ke beech mein ho. Yahan "abcd" hai jo valid hai, toh true dega.
        System.out.println(Pattern.matches("[a-z]{4}","abcde")); // false [a-z]{4} ka matlab hai: exactly 4 characters honi chahiye jo a se z ke beech mein ho. Yahan "abcde" hai jo 5 characters hain, toh false dega.
        
        System.out.println(Pattern.matches("[a-z]{4,}","abcd")); // true [a-z]{4,} ka matlab hai: 4 ya zyada characters honi chahiye jo a se z ke beech mein ho. Yahan "abcd" hai jo 4 characters hain, toh true dega.
        System.out.println(Pattern.matches("[a-z]{4,}","abcde")); // true [a-z]{4,} ka matlab hai: 4 ya zyada characters honi chahiye jo a se z ke beech mein ho. Yahan "abcde" hai jo 5 characters hain, toh true dega.
        System.out.println(Pattern.matches("[a-z]{4,}","abc")); // false [a-z]{4,} ka matlab hai: 4 ya zyada characters honi chahiye jo a se z ke beech mein ho. Yahan "abc" hai jo sirf 3 characters hain, toh false dega.

        System.out.println(Pattern.matches("[a-z]{4,6}","abcd")); // true [a-z]{4,6} ka matlab hai: 4 se 6 characters honi chahiye jo a se z ke beech mein ho. Yahan "abcd" hai jo 4 characters hain, toh true dega.
        System.out.println(Pattern.matches("[a-z]{4,6}","abcdefgssj")); // false [a-z]{4,6} ka matlab hai: 4 se 6 characters honi chahiye jo a se z ke beech mein ho. Yahan "abcdefgssj" hai jo 10 characters hain, toh false dega.

        System.out.println(Pattern.matches(".","a")); // true . ka matlab hai: koi bhi single character ho. Yahan "a" hai jo ek character hai, toh true dega.
        System.out.println(Pattern.matches(".","")); // false . ka matlab hai: koi bhi single character ho. Yahan empty string hai, toh false dega.
        System.out.println(Pattern.matches(".","123")); // false . ka matlab hai: koi bhi single character ho. Yahan "123" hai jo multiple characters hain, toh false dega.

        System.out.println(Pattern.matches("\\d","1")); // true \\d ka matlab hai: koi bhi digit (0 se 9 ke beech mein). Yahan "1" hai jo ek digit hai, toh true dega.
        System.out.println(Pattern.matches("\\d","a")); // false \\d ka matlab hai: koi bhi digit (0 se 9 ke beech mein). Yahan "a" hai jo digit nahi hai, toh false dega.
        System.out.println(Pattern.matches("\\d{3}","123")); // true \\d{3} ka matlab hai: exactly 3 digits honi chahiye. Yahan "123" hai jo 3 digits hain, toh true dega.

        System.out.println(Pattern.matches("\\D","a")); // true \\D ka matlab hai: koi bhi non-digit character (0 se 9 ke alawa). Yahan "a" hai jo non-digit hai, toh true dega.
        System.out.println(Pattern.matches("\\D","1")); // false \\D ka matlab hai: koi bhi non-digit character (0 se 9 ke alawa). Y

        System.out.println(Pattern.matches("\\s"," ")); // true \\s ka matlab hai: koi bhi whitespace character (space, tab, newline, etc.). Yahan " " hai jo ek space hai, toh true dega.
        System.out.println(Pattern.matches("\\s","a")); // false \\s ka matlab hai: koi bhi whitespace character (space, tab, newline, etc.). Yahan "a" hai jo whitespace nahi hai, toh false dega.
        System.out.println(Pattern.matches("\\s"," a")); // false \\s ka matlab hai: koi bhi whitespace character (space, tab, newline, etc.). Yahan " a" hai jo ek space aur ek character hai, lekin sirf ek space hona chahiye tha, toh false dega. 

        System.out.println(Pattern.matches("\\S","abc")); // true \\S ka matlab hai: koi bhi non-whitespace character (space, tab, newline, etc. ke alawa). Yahan "abc" hai jo non-whitespace hai, toh true dega.
        System.out.println(Pattern.matches("\\S"," ")); // false \\S ka matlab hai: koi bhi non-whitespace character (space, tab, newline, etc. ke alawa). Yahan " " hai jo whitespace hai, toh false dega.

        System.out.println(Pattern.matches("\\w","a")); // true \\w ka matlab hai: koi bhi word character (a-z, A-Z, 0-9, ya underscore). Yahan "a" hai jo ek word character hai, toh true dega.
        System.out.println(Pattern.matches("\\w","1")); // true \\w ka matlab hai: koi bhi word character (a-z, A-Z, 0-9, ya underscore). Yahan "1" hai jo ek word character hai, toh true dega.
        System.out.println(Pattern.matches("\\w","_")); // true \\w ka matlab hai: koi bhi word character (a-z, A-Z, 0-9, ya underscore). Yahan "_" hai jo ek word character hai, toh true dega.
        System.out.println(Pattern.matches("\\w","@")); // false \\w ka matlab hai: koi bhi word character (a-z, A-Z, 0-9, ya underscore). Yahan "@" hai jo word character nahi hai, toh false dega.

        System.out.println(Pattern.matches("\\W","@")); // true \\W ka matlab hai: koi bhi non-word character (a-z, A-Z, 0-9, ya underscore ke alawa). Yahan "@" hai jo non-word character hai, toh true dega.
        System.out.println(Pattern.matches("\\W","a")); // false \\W ka matlab hai: koi bhi non-word character (a-z, A-Z, 0-9, ya underscore ke alawa). Yahan "a" hai jo word character hai, toh false dega.

        // Example: "cat" word boundary par hai ya nahi
        System.out.println(Pattern.compile("\\bcat\\b").matcher("a cat is here").find()); // true
        System.out.println(Pattern.compile("\\bcat\\b").matcher("concatenate").find()); // false
    }
}
