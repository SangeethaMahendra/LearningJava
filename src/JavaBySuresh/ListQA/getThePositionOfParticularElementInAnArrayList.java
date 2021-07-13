package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class getThePositionOfParticularElementInAnArrayList {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        for(String temp : l1){
            System.out.println(temp);
        }
        int s = l1.indexOf("Pooja");
        System.out.println(s);
    }
}
