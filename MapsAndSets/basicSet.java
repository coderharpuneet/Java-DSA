import java.util.HashSet;

public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(-7);
        System.out.println(set);
        System.out.println("Size of set: "+set.size());
    }
}
