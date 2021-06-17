package JavaBySuresh.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arrayIteration {

    public static void main(String[] args) {
        enhancedForLoop e = new enhancedForLoop();
        e.list();
        e.listInt();
        e.Iterator();
        e.ListIterator();
    }
}
//using enhanced for loop
class enhancedForLoop{
     void list() {
         List<String> l = new ArrayList<String>();
         l.add("yes");
         l.add("No");
         l.add("Maybe");
         for (String temp : l) {
             System.out.println(temp);
         }
     }
     void listInt(){
         List<Integer> l1=new ArrayList<Integer>();
         l1.add(3);
         l1.add(2);
         l1.add(1);
         for(Integer temp:l1)
         {
             System.out.println(temp);
         }
     }

     //using iterator hasNext(), next()
    void Iterator(){
        List<Integer> l2=new ArrayList<Integer>();
        l2.add(3);
        l2.add(2);
        l2.add(1);
        Iterator<Integer> i = l2.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    //ListIterator using hasNext to print element for forward direction
    void ListIterator(){
         List<Integer> l3 = new ArrayList<Integer>();
         l3.add(7);
         l3.add(8);
         l3.add(9);
         ListIterator<Integer> i1 = l3.listIterator();
        System.out.println("***Forward-Direction");
         while(i1.hasNext())
         {
             System.out.println(i1.next());
         }
        //ListIterator using hasPrevious to print element for backward direction
        System.out.println("Backward-Direction");
        while(i1.hasPrevious())
        {
            System.out.println(i1.previous());
        }
    }

}