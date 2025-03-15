class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class maxNode {
    public static int max(Node a){
        if(a==null) return Integer.MIN_VALUE;
        return Math.max(a.val,Math.max(max(a.left),max(a.right)));
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(49);
        Node e=new Node(5);
        Node f=new Node(6);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        e.right=f;
        System.out.println(max(a));
    }
}
