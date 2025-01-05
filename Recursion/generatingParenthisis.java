public class generatingParenthisis {
    public static void parentheses(String s,int o,int c,int n){
        int m=s.length();
        if(m==2*n ){
            System.out.println(s);
            return;
        }
        if(o<n){
            parentheses(s+'(',o+1,c,n);
        }
        if(c<o){
            parentheses(s+')',o,c+1,n);
        }
    }
    public static void main(String[] args) {
        int n=3;
        parentheses("",0,0,n);
    }
}
