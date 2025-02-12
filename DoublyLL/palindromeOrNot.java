public class palindromeOrNot {
    public static void main(String[] args) {
        dNode a=new dNode(10);
        dNode b=new dNode(20);
        dNode c=new dNode(30);
        dNode d=new dNode(30);
        dNode e=new dNode(40);
        dNode f=new dNode(10);
        a.next=b; b.prev=a;
        b.next=c; c.prev=b;
        c.next=d; d.prev=c;
        d.next=e; e.prev=d;

        e.next=f; f.prev=e;
        dNode head=a;
        dNode tail=a;
        while(tail.next!=null){
            tail=tail.next;
        }
        Boolean flag =true;
        while(head!=tail && head.prev!=tail){
            if(head.val!=tail.val){
                flag=false;
                break;
            }
            head=head.next;
            tail=tail.prev;
        }
        if(flag){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
