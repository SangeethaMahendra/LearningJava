package JavaBySuresh.ListQA;

import java.util.ArrayList;

public class findTheNumberOfElementsPresentInAnArrayList {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>(15);
        // ArrayList with Capacity 4
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        l1.add("Balaji");
        l1.add("Shiva");
        System.out.println("No of elements in given Array LIst " + l1.size());

    }
}
