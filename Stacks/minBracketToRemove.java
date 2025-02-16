import java.util.Stack;

public class minBracketToRemove {
    public static int minRemove(String s){
        int n=s.length();
        boolean flag=true;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') st.push(ch);
            else{
                if(st.size()==0) {
                    return 1;
                }
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) flag= false;
        else flag= true;
        if(flag) return 0;
        else return st.size();
        
    }
    public static void main(String[] args) {
        String s=")(()))(";
        System.out.println(minRemove(s));
    }
}
