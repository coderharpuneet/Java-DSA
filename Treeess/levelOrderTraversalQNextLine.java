import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversalQNextLine {
    public static class Pair{
        Node node;
        int lvl;
        Pair(Node node, int lvl){
            this.node=node;
            this.lvl=lvl;
        }
        
    }
    public static void levelOrderTraversalQueueNextLine(Node root){
        int prevLvl=0;
        Queue<Pair> q=new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front=q.remove();
            Node temp=front.node;
            int lvl=front.lvl;
            if(lvl!=prevLvl){
                System.out.println();
                prevLvl++;
            }
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right,lvl+1));
        }
        System.out.println();

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
        levelOrderTraversalQueueNextLine(a);
    }
}
