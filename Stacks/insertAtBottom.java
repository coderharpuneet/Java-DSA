import java.util.Stack;

public class insertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack<Integer> newst=new Stack<>();
        while(st.size()>0){
            newst.push(st.pop());
        }
        st.push(5);
        while(newst.size()>0){
            st.push(newst.pop());
        }
        System.out.println(st); 
    }
}
