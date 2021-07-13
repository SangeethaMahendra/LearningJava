package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class convertArrayListToArray {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        l1.add("Balaji");
        String[] str = l1.toArray(new String[l1.size()]);
        System.out.println("Convert Array List to Array");
        for(String temp : str)
        {
            System.out.println(temp);
        }
    }
}
