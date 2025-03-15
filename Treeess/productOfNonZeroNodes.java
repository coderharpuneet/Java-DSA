public class productOfNonZeroNodes {
    public static int productOfNonZero(Node a){
        if(a==null || a.val==0) return 1;
        return a.val*productOfNonZero(a.left)*productOfNonZero(a.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(0);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        e.right=f;
        System.out.println(productOfNonZero(a));
    }
}
