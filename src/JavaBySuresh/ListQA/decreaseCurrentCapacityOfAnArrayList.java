package JavaBySuresh.ListQA;

import java.util.ArrayList;

public class decreaseCurrentCapacityOfAnArrayList {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>(15);
        // ArrayList with Capacity 4
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        l1.add("Balaji");
        l1.add("Shiva");
        l1.trimToSize();  //Trims the capacity of this ArrayList instance to be the list's current size.
        for (String temp: l1) {
            System.out.println(temp);
        }
        System.out.println(l1.size());
    }
}
