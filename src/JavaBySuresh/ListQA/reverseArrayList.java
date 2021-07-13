package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class reverseArrayList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Arni");
        l.add("Pooja");
        l.add("Shiva");
        l.add("Balaji");
        ListIterator<String> i = l.listIterator();
        System.out.println("Forward Direction");
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Backward Direction");
        while(i.hasPrevious()){
            System.out.println(i.previous());
        }
    }
}
