public class implementUsingArray {
    
    public static void main(String[] args) {
        stackss st=new stackss();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
    }
}
class stackss{
    int [] arr=new int[5];
    private int idx=0;
    void push(int x){
        arr[idx]=x;
        idx++;
    }
    int peek(){
        if(isFull()){
            System.out.println("Stack is full");
            return -1;
        }
        if(idx==0){
            System.out.println("Stack is Empty");
        }
        return arr[idx-1];
    }
    int pop(){
        if(idx==0){
            System.out.println("Stack is Empty");
            return -1;
        }
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;
    }
    void display(){
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        return idx==0;
    }
    boolean isFull(){
        return idx==arr.length;
    }
}