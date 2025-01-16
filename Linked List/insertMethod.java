class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
    }
}
class LL{
    Node head;
    Node tail;
    int size=0;
    public void insertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
            size++;
        } 
        else{
            tail.next=temp;
            tail=temp;
            size++;
        }
    }
    public void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null) {
            head=tail=temp;
            size++;
        }
        else{
            
            temp.next=head;
            head=temp;
            size++;
        }
    }
    public void insert(int idx,int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if (idx==size){
            insertAtEnd(val);
            return;
        }
        if(idx>size){
            System.out.println("Invalid Index");
            return;
        }
        Node temp=new Node(val);
        Node x=head;
        for(int i=1;i<=idx-1;i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
public class insertMethod {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtHead(5);
        list.insert(2,15);
        list.display();
    }
}
