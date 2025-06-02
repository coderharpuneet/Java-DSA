import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexPrac2 {
    public static void main(String[] args) {
        String str="Hello world this year is 2025 next year is 2026";
        String reg="\\d{4}";
        Pattern pattern=Pattern.compile(reg);
        Matcher m=pattern.matcher(str);
        while(m.find()){
            System.out.println(m.group());
            System.out.println(" || Start: "+m.start()+" || End: "+m.end());
        }
        String news=m.replaceAll("####");
        System.out.println("Updated String: " + news);


        String str2="Today's date is 28-05-2025";
        String reg2="(\\d{2})-(\\d{2})-(\\d{4})";
        Pattern pattern2=Pattern.compile(reg2);
        Matcher m2=pattern2.matcher(str2);
        if(m2.find()){
            System.out.println("Date: "+m2.group(1));
            System.out.println("Month: "+m2.group(2));
            System.out.println("Year: "+m2.group(3));
        }


    }
}
