import java.util.Stack;

public class ReverseStackUsingExtraStack {
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Original Stack:");
        System.out.println(stack);
        Stack rev=new Stack<>();
        while(!stack.isEmpty()){
            rev.push(stack.pop());
        }
        System.out.println("Reversed Stack:");
        System.out.println(rev);
    }
}
