public class binaryStringConsecutive {
    public static void consec(String s,int n){
        int m=s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='0'){
            consec(s+'1', n);
            consec(s+'0', n);
        }
        else consec(s+'0', n);
    }
    public static void main(String[] args) {
        int n=3;
        consec("",n);
    }
}
