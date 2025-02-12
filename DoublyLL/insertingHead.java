class DLL{
    dNode head;
    dNode tail;
    int size=0;
    public void insertAtHead(int val){
        dNode temp=new dNode(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;

    }
    public void printdll(){
        dNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
public class insertingHead {
    
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.insertAtHead(60);
        list.printdll();
    }
}
