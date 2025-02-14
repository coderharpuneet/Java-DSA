import java.util.Stack;

public class insertAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        int idx=2;
        int value=5;
        Stack<Integer> stack=new Stack<>();
        while(st.size()>idx){
            stack.push(st.pop());
        }
        st.push(value);
        while(stack.size()>0){
            st.push(stack.pop());
        }
        System.out.println(st);
    }
}
