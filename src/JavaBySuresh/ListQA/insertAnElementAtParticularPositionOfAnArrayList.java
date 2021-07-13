package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class insertAnElementAtParticularPositionOfAnArrayList {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        System.out.println( "Before adding element " + l1);
        l1.add(2,"Ganesh");
        System.out.println(" After adding element at a particular position " + l1);
    }
}
