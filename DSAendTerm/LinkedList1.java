class Node{
    int val;
    Node next;
    Node (int val){
        this.val=val;
    }

}

class LL{
    Node head;
    Node tail;
    static int size=0;

    public void printLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public void insertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    public void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    public void insert(int index,int value){
        Node temp=head;
        Node newNode=new Node(value);
        if(index==0){
            insertAtHead(value);
            return;
        }
        for(int i=0;i<index-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Index out of bounds");
            return;
        }
        if(temp==tail){
            insertAtEnd(value);
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }

    public int getElement(int index){
        if(index<0 || index>size){
            System.out.println("Index out of bounds");
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index && temp!=null;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    public void set(int index,int value){
        if(index<0 || index>size-1){
            System.out.println("Index out of bounds");
            return;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.val=value;
    }
    public void deleteAtHead(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        if(head==tail){
            head=tail=null;
        }
        else{
            head=head.next;
        }
        size--;
    }
    public void deleteTail(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        tail=temp;
        temp.next=null;
        size--;
    }
    public void delete(int index){
        if(index<0 || index>=size){
            System.out.println("Index out of bounds");
            return;
        }
        if(index==0){
            deleteAtHead();
            return;
        }
        if(index==size-1){
            deleteTail();
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1 && temp!=null;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;

    }
}
public class LinkedList1 {
    public static void printLLrecursively(Node a){
        if(a==null) return;
        System.out.print(a.val+" ");
        printLLrecursively(a.next);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //Printing the Linked List recursively
        System.out.println("Printing the Linked List recursively:");
        printLLrecursively(a);
        System.out.println();
        System.out.println();
        
        //Creating a class using the LL
        LL ll = new LL();
        ll.size=5;
        ll.head=a;
        ll.tail=e;
        //Inserting a new Node at the end.
        ll.insertAtEnd(6);
        System.out.println("Printing the Linked List using the LL class:");
        Node temp=ll.head;
        ll.printLL();
        System.out.println();
        System.out.println();

        //Inserting a Node at the head.
        ll.insertAtHead(0);
        System.out.println("Linked List after adding a Node at the head:");
        ll.printLL();
        System.out.println();
        System.out.println();


        //Inserting Node at any given index(zero-based-indexing)
        ll.insert(2,7);
        System.out.println("Linked List after adding a Node at any given index:");
        ll.printLL();
        System.out.println();
        System.out.println();


        //Get element from index
        System.out.println("Element at index 3:");
        System.out.println(ll.getElement(3));
        System.out.println();
        System.out.println();

        //Set the value of element.
        System.out.println("Setting the value of element at index 3 to 10:");
        System.out.println("Linked List before setting the value:");
        ll.printLL();
        ll.set(3,10);
        System.out.println();
        System.out.println("Linked List after setting the value:");
        ll.printLL();
        System.out.println();
        System.out.println();

        //Deleting the Node at head.
        ll.deleteAtHead();
        System.out.println("Linked List after deleting the Node at head:");
        ll.printLL();
        System.out.println();
        System.out.println();

        //Deleting the Node at Tail.
        ll.deleteTail();
        System.out.println("Linked List after deleting the Node at tail:");
        ll.printLL();
        System.out.println();
        System.out.println();

        //Deleting the Node at any given index.
        System.out.println("Deleting the Node at index 2:");
        ll.delete(2);
        System.out.println("Linked List after deleting the Node at index 2:");
        ll.printLL();
        System.out.println();
        System.out.println();
    }
}

