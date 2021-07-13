package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        ArrayList<String> d = new ArrayList<>();
        l.add("Elon Musk");
        l.add("Jeff Bezos");
        l.add("Bill Gates");
        l.add("Jeff Bezos");
        for(String temp:l){
            if(!d.contains(temp)){
                d.add(temp);
            }
        }
        System.out.println(d);
    }
}
