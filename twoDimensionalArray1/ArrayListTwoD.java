package twoDimensionalArray1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTwoD {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> b = new ArrayList<>();
        b.add(4);   
        b.add(5);
        b.add(6);
        b.add(7);
        List<Integer> c = new ArrayList<>();
        c.add(8);
        c.add(9);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a);
    }
}
