package JavaBySuresh.Collection.ArrayList;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class IterateTreeSet {
    void IterateTree(){
        Set<String> s1 = new TreeSet<>();
        s1.add("X");
        s1.add("B");
        s1.add("Z");  //Treeset does not allow null
        Iterator i1 = s1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
    }

    public static void main(String[] args) {
        IterateTreeSet obj = new IterateTreeSet();
        obj.IterateTree();
    }
}
