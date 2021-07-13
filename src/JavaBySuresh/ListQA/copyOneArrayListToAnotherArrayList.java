package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class copyOneArrayListToAnotherArrayList {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        l1.add("Balaji");
        ArrayList al = (ArrayList)l1.clone();

        System.out.println("copy one array list to another array list " + al);


    }
}
