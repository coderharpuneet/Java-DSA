import java.util.Scanner;

public class repititions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int max=1;
        int i=0,j=0;
        while(i<s.length() && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else{
                max=Math.max(max,j-i);
                i=j;
            }
        }
        max=Math.max(max,j-i);
        
        System.out.println(max);
    }
}
