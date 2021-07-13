package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class appendAnElementAtTheEndOfAnArrayList
{
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        l1.add(3,"Ganesh");
        Iterator<String> i = l1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
