package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class checkParticularElementExistOrNot {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Arni");
        l.add("Pooja");
        l.add("Shiva");
        l.add("Balaji");
        if(l.contains("Pooja")){
            System.out.println("Element Exist");
        }else
        {
            System.out.println("Element Not Exist");
        }
    }
}
