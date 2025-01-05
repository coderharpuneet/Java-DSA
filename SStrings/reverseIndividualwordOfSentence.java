import java.util.Scanner;

public class reverseIndividualwordOfSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int i=0,j=0,n=str.length();
        while(j<n){
            if(str.charAt(j)!=' ') j++;
            else{
                reverse(str, i, j-1);
                i=j+1;
                j=i;
            }
        }
        reverse(str, i, j-1);
        System.out.println(str);
    }
    public static void reverse(StringBuilder str,int i,int j){
        while(i<=j){
            char temp=str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}
