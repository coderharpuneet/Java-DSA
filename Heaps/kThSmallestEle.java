import java.util.Collections;
import java.util.PriorityQueue;

public class kThSmallestEle {
    public static void main(String[] args) {
        int[] arr={10,2,3,8,-4,-2,6};
        int k=4;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.remove();
            }
        }
        System.out.println("The " + k + "th smallest element is: " + pq.peek());
    }
}