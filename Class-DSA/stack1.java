import java.util.Stack;

public class stack1 {

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }

    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        
        // System.out.println(st);
        // System.out.println("Current top element of stack: "+st.peek());
        // System.out.println("Deleting top element of stack: "+st.pop());
        // System.out.println("Is empty stack: "+st.isEmpty());
        System.out.println(st);
        // Stack<Integer> st1=new Stack<>();
        // while(!st.isEmpty()){
        //     st1.push(st.pop());
        // }
        // st.push(100);
        // while(!st1.isEmpty()){
        //     st.push(st1.pop());
        // }
        // System.out.println(st);
        reverseStack(st);
        System.out.println(st);

    }
}


