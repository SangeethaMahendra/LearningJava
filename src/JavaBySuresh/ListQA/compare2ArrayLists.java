package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;

public class compare2ArrayLists {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        l1.add("Balaji");

        List<String> l2 = new ArrayList<String>();
        l2.add("Kamala");
        l2.add("Madhav");
        l2.add("Shraya");
        l2.add("Bala");
        boolean flag =  l1.equals(l2);
        if(flag){
            System.out.println("Array Lists are Equal");
        }else
        {
            System.out.println("Array Lists are not Equal");
        }

    }
}