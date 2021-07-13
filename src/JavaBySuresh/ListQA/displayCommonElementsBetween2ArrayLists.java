package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class displayCommonElementsBetween2ArrayLists {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");

        List<String> l2 = new ArrayList<String>();
        l2.add("Elon Musk");
        l2.add("Shiva");
        l2.add("Bill Gates");
        l1.retainAll(l2);
        System.out.println(l1);

    }
}
