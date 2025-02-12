public class randomPrint {
    public static void randomNodePrint(dNode node){
        while(node.prev!=null){
            node=node.prev;
        }
        dNode head=node;
        while(node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        dNode a=new dNode(10);
        dNode b=new dNode(20);
        dNode c=new dNode(30);
        dNode d=new dNode(40);
        a.next=b; b.prev=a;
        b.next=c; c.prev=b;
        c.next=d; d.prev=c;
        randomNodePrint(c);
    }
}
