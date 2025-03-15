public class minNode {
    public static int min(Node a){
        if(a==null) return Integer.MAX_VALUE;
        return Math.min(a.val,Math.min(min(a.left), min(a.right)));
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        e.right=f;
        System.out.println(min(a));
    }
}
