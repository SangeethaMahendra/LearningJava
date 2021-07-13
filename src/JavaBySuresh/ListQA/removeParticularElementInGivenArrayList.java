package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class removeParticularElementInGivenArrayList {
    public static void main(String[] args) {
    List<String> l =  new ArrayList<>();
    l.add("Arni");
    l.add("Akshithi");
    l.add("Riya");
    l.add("Anitha");
        System.out.println("List of Names " + l);
        l.remove(3);
        System.out.println("After Remove particular Element from List Based on Index " + l);
    }
}
