import java.util.Scanner;
import java.util.*;
class Base62Encoder {
    private static final String BASE62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encode(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(BASE62.charAt(num % 62));
            num /= 62;
        }
        return sb.reverse().toString();
    }
}

class URLShortener {
    private static final String BASE_URL = "https://harpuneet.com/";
    private Map<String, String> codeToUrl = new HashMap<>();
    private Map<String, String> urlToCode = new HashMap<>();
    private int id = 1000;

    public String shorten(String longUrl) {
        if (urlToCode.containsKey(longUrl)) { //Logic is that
            return BASE_URL + urlToCode.get(longUrl);
        }
        String code = Base62Encoder.encode(id++);
        urlToCode.put(longUrl, code);
        codeToUrl.put(code, longUrl);
        return BASE_URL + code;
    }

    public String expand(String shortUrl) {
        String code = shortUrl.replace(BASE_URL, "");
        return codeToUrl.getOrDefault(code, "URL not found!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        URLShortener shortener = new URLShortener();

        while (true) {
            System.out.println("\n1. Shorten URL\n2. Expand Short URL\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter Long URL: ");
                String longUrl = sc.nextLine();
                String shortUrl = shortener.shorten(longUrl);
                System.out.println("Short URL: " + shortUrl);
            } else if (choice == 2) {
                System.out.print("Enter Short URL: ");
                String shortUrl = sc.nextLine();
                String longUrl = shortener.expand(shortUrl);
                System.out.println("Original URL: " + longUrl);
            } else {
                break;
            }
        }

        sc.close();
    }
}

