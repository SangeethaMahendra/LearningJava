package JavaBySuresh.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class arrayDemo1 {

    public static void main(String[] args) {
        // generics <> supports homogenous data elements
        List<String> l = new ArrayList<String>();
        l.add("Arni");
        l.add("Pooja");
        l.add("Shiva");
        l.add("Balaji");
        System.out.println(l); //output: [Arni, Pooja, Shiva, Balaji]

        //same with other primitive data elements
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(100);
        l1.add(200);
        l1.add(300);
        l1.add(400);
        System.out.println(l1); // output : [100, 200, 300, 400]

        List<Boolean> l2 = new ArrayList<Boolean>();
        l2.add(true);
        l2.add(false);
        l2.add(true);
        System.out.println(l2); // output : [true, false, true]
        System.out.println(l2); // output : [true, false, true]

        List<Float> l3 = new ArrayList<Float>();
        l3.add(45f);
        l3.add(52.3f);
        l3.add(80.005f);
        System.out.println(l3); //output :[45.0, 52.3, 80.005]

        List<Double> l4 = new ArrayList<>();
        l4.add(45.8);
        l4.add(52.3);
        l4.add(80d);
        System.out.println(l4); //output : [45.0, 52.3, 80.005]
    }

}
