package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class getLastOccurrenceOfAnElementInGivenArrayList {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(3);
        int s = l1.lastIndexOf(3);
        System.out.println(s);
    }
}
