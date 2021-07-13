package JavaBySuresh.ListQA;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class AddElementsToArrayList {
    public static void main(String[] args) {
       List<String> l = new ArrayList<String>();
       l.add("X");
       l.add("Y");
       l.add("Z");
        Iterator<String> i = l.iterator();
            while(i.hasNext()) {
                System.out.println(i.next());
            }
    }
}
