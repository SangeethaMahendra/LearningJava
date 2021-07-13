package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class getFirstOccurrenceOfAnElementInGivenArrayList {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        l1.add("Shiva");
        for(String temp : l1){
            System.out.println(temp);
        }
        int s = l1.indexOf("Shiva");
        System.out.println(s);


//        List<Integer> l1 = new ArrayList<>();
//        l1.add(1);
//        l1.add(2);
//        l1.add(3);
//        l1.add(3);
////        for (Integer temp : l1) {
////            System.out.println(temp);
////        }
//        int s = l1.indexOf(3);
//        System.out.println(s);
    }
}
