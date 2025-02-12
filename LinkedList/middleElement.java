class LL{
    Node head;
    Node tail;
    public void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head =temp;
        }
    }
    public void middle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null &&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.val);
    }
}
public class middleElement {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.insertAtHead(60);
        list.middle();
    }
}
