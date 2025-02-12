class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val=val;
    }

}
public class print {
    public static void printdll(dNode node){
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
        printdll(a);
    }
}
