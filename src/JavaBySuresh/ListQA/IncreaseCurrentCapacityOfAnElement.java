package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class IncreaseCurrentCapacityOfAnElement {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>();
        // ArrayList with Capacity 4
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        l1.add("Balaji");
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println("Increasing the capacity of ArrayList numbers to store upto 5  ");
        //Increase capacity to 5
        l1.ensureCapacity(5);
        l1.add("Elon Musk");
        // let us print all the elements available in list
        for (String temp: l1) {
            System.out.println(temp);
        }
        System.out.println(l1.size());


    }
}
