package JavaBySuresh.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

// How to get particular element from collection?-----> get(index)
public class getElementDemo {
    public static void main(String[] args) {
         getE obj = new getE();
         obj.disp();
    }
}

class getE{
    void disp(){
        List<String> l = new ArrayList<>();
        l.add("Arni");
        l.add("Akshithi");
        l.add("Nandhika");
        System.out.println(l.get(1));

    }
}
