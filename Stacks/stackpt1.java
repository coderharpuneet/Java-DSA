import java.util.Stack;

public class stackpt1 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st); // Printing the entire Stack
        System.out.println(st.peek()); // Printing the top element of the Stack
        System.out.println(st.pop()); // Removing the top element of the Stack
        System.out.println(st); // Printing the entire Stack
        System.out.println(st.size()); // Printing the size of the Stack
        System.out.println(st.isEmpty()); // Checking if the Stack is empty or not
        st.clear(); // Clearing the Stack
        System.out.println(st); // Printing the entire Stack
        
    }
}
