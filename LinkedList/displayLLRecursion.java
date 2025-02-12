public class displayLLRecursion {
    public static void displayRecursive(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.val);
        displayRecursive(head.next);
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        displayRecursive(a);
    }
}
