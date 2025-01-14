class LL{
    Node head;
    Node tail;
    public void insertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
;}
public class insertionAtEnd {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();
    }
}
