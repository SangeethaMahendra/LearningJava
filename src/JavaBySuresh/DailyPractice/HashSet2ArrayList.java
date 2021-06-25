package JavaBySuresh.DailyPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet2ArrayList {
    void toArrayList(){
        Set<String> s = new HashSet<>();
        s.add("A");
        s.add("B");
        s.add("C");
        List<String> a = new ArrayList<>(s);
        System.out.println(a);
    }


    public static void main(String[] args) {
         HashSet2ArrayList obj = new HashSet2ArrayList();
         obj.toArrayList();
    }
}
