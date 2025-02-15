public class implementUsingLL {
    public static void main(String[] args) {
        stackll st=new stackll();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
    }
}
class Node{
    int val;
    Node next;
    Node(int x){
        val=x;
        next=null;
    }
}
class stackll{
    Node head=null;
    int size=0;
    void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        size++;
    }
    int pop(){
        if(head==null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int x=head.val;
        head=head.next;
        size--;
        return x;
    }
    int peek(){
        if(head==null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return head.val;
    }
    boolean isEmpty(){
        return head==null;
    }
    int size(){
        return size;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}