import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversalRToL {
    public static void levelOrderRightToLeft(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front=q.remove();
            System.out.print(front.val+" ");
            if(front.right!=null) q.add(front.right);
            if(front.left!=null) q.add(front.left);
        }
        
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
        levelOrderRightToLeft(a);
    }
}
