package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class ReplaceParticularElementInGivenArrayList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Arni");
        l.add("Pooja");
        l.add("Shiva");
        l.add("Balaji");
        System.out.println(l);
        l.set(2,"Latha");
        System.out.println(l);
    }
}
