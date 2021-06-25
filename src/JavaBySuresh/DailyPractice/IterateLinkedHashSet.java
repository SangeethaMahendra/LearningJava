package JavaBySuresh.DailyPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IterateLinkedHashSet {
    void linkedH(){
        Set<String> s1 = new LinkedHashSet<>();
        s1.add("A");
        s1.add("B");
        s1.add("C");
        s1.add(null);
        Iterator i1 = s1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
    }

    public static void main(String[] args) {
        IterateLinkedHashSet obj = new IterateLinkedHashSet();
        obj.linkedH();
    }
}
