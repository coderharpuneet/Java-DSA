class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class ListNodeClass {
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        //Linking the list
        a.next=b; // 10->20
        b.next=c; // 10->20->30
        c.next=d; //10->20->30->40
        d.next=e; //10->20->30->40->50
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(d);
        System.out.println(c.next);
        System.out.println(e);
        System.out.println(d.next);

        //Traversing the list only using a
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);
        
    }
}
