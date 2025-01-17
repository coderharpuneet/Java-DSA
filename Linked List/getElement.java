class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class LL{
    Node head;
    Node tail;
    int size;
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null){ 
            head=tail=temp;
            size++;
        }
        else{
            temp.next=head;
            head=temp;
            size++;
        }
    }
    void inseretAtTail(int val){
        Node temp=new Node(val);
        if(head==null) {
            head=tail=temp;
            size++;
        }
        else{
            tail.next=temp;
            tail=temp;
            size++;
        }
    }
    int get(int idx) throws Error{
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0) {
            throw new Error("Invalid Index");
        } 
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
}

public class getElement {
    public static void main(String[] args) {
        LL list =new LL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.insertAtHead(60);
        System.out.println(list.get(3));
    }
}
