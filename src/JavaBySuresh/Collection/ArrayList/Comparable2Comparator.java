package JavaBySuresh.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable2Comparator {
    public static void main(String[] args) {
        List<Emp> l = new ArrayList<Emp>();
        l.add(new Emp(6, "B"));
        l.add(new Emp(5,"A"));
        l.add(new Emp(7,"C"));
        Collections.sort(l);
        System.out.println(l);
    }
}
