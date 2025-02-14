import java.util.Stack;

public class copyStackIntoAnother {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        Stack<Integer> newst=new Stack<>();
        while(st.size()>0){
            newst.push(st.pop());
        }
        Stack<Integer> res=new Stack<>();
        while(newst.size()>0){
            res.push(newst.pop());
        }
        System.out.println(res);
    }
}
