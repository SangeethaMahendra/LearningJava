package JavaBySuresh.DailyPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetFailFast {
    public static void main(String[] args) {
        Set<String> a = new HashSet<>();
        a.add("A");
        a.add("B");
        a.add("C");
        Iterator<String> i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            a.add("D");
        }
    }
}
//Output : Exception in thread "main" java.util.ConcurrentModificationException
