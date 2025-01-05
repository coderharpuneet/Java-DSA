import java.util.Arrays;

public class basicFunctionsInArray {
    public static void main(String[] args) {
        int[] arr={20,30,40,50,60};
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        
    }
}
