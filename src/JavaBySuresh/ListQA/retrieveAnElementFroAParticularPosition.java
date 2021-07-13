package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class retrieveAnElementFroAParticularPosition {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        System.out.println(l1.get(1));
    }
}
