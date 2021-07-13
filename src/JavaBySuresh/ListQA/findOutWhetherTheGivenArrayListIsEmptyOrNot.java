package JavaBySuresh.ListQA;

import java.util.ArrayList;

public class findOutWhetherTheGivenArrayListIsEmptyOrNot {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>(15);
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        l1.add("Balaji");
        l1.add("Shiva");
        System.out.println("The given Array List is empty or not " );
        System.out.println(l1.isEmpty());
    }
}
