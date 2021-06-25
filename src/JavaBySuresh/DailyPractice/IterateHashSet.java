package JavaBySuresh.DailyPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateHashSet {
    void homoGenius(){
        Set<String> s = new HashSet<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add(null);
        Iterator<String> i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    void heteroGenius(){
        Set s1 = new HashSet<>();
        s1.add(10);
        s1.add(20.9f);
        s1.add("C");
        s1.add(null);
        s1.add(false);
        Iterator  i1 = s1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
    }

    void forEach(){
        Set<Integer> s2 = new HashSet<>();
        s2.add(10);
        s2.add(20);
        s2.add(30);
        s2.add(null);
        s2.add(40);
        for(Integer temp:s2){
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        IterateHashSet obj = new IterateHashSet();
        obj.homoGenius();
        obj.heteroGenius();
        obj.forEach();
    }
}
