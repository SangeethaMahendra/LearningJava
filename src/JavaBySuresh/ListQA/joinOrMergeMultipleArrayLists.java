package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class joinOrMergeMultipleArrayLists {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        l1.add("Balaji");
     //   Iterator i = l1.iterator();
        System.out.println("First Array List " + l1);

        List<String> l2 = new ArrayList<String>();
        l2.add("Kamala");
        l2.add("Madhav");
        l2.add("Shraya");
        l2.add("Bala");
       // Iterator i1 = l2.iterator();
        System.out.println("Second Array List " + l2);
        l1.addAll(l2);
        System.out.println("Joined/Merged Array Lists " + l1);





    }
}
