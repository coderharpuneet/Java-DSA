public class level {
    public static int level(Node a){
        if(a==null) return 0;
        return 1+Math.max(level(a.left), level(a.right));
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
        System.out.println(level(a));
    }
}
