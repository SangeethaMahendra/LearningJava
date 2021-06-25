package JavaBySuresh.DailyPractice;

import java.util.HashSet;
import java.util.Set;

public class ElementExistHashSet {
    void elementExist(){
        Set<String> s = new HashSet<>();
        s.add("A");
        s.add("B");
        s.add("C");
        boolean flag =  s.contains("I");
        if (flag) {
            System.out.println("Element exist");
        } else {
            System.out.println("Element not exist");
        }
    }

    public static void main(String[] args) {
        ElementExistHashSet obj = new ElementExistHashSet();
        obj.elementExist();
    }
}
