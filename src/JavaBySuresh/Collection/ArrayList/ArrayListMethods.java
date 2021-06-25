package JavaBySuresh.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

// equals(), addAll(), retainAll(), removeAll(), size(), clear()

//Req:How to compare 2 arraylists?
//--------------------------------
//equals() was over-ridden in collection framework as data-comparison
public class ArrayListMethods {
    public static void main(String[] args) {
        compare obj = new compare();
        obj.compareE();
        obj.concate();
        obj.commonData();
        //obj.retailA();
    }
}
class compare{
    List<String> l = new ArrayList<String>(); //array list to be member function inorder to use in another method
    //List<String> l2 = new ArrayList<String>(); //so declared here
    List<String> l3 = new ArrayList<String>(); //list 3
    List<String> l4 = new ArrayList<String>(); //list 4
    void compareE() {
        l.add("Elon Musk"); //list 1
        l.add("Jeff Bezos");
        l.add("Bill Gates");

        List<String> l1 = new ArrayList<String>(); //list 2
        l1.add("Elon Musk");
        l1.add("Jeff Bezos");
        l1.add("Bill Gates");
        boolean flag = l.equals(l1);  // compare using equals method
        // System.out.println(flag); // output : true
        if (flag) {
            System.out.println("\"2 ArrayLists are equal\"");
        } else {
            System.out.println("2 ArrayLists are not equal");
        }
    }
     //Req:How to concatenate/club 2 arraylists?
     void concate() {
        List<String> l2 = new ArrayList<String>(); //list 2
        l2.add("Mark Zuckerberg");
        l2.add("Warren Buffett");
        l2.add("Bill Gates");
        l2.addAll(l);  //addAll() used to concatenate/club 2 arraylists
        System.out.println("Concatenate/club 2 arraylists " + l2); //output: [Mark Zuckerberg, Warren Buffett, Bill Gates, Elon Musk, Jeff Bezos, Bill Gates]
         l.retainAll(l2);
         System.out.println("Common data between 2 ArrayLists " + l2);
    }
       //Req:How to display common data between 2 ArrayLists?
    void commonData(){
      //  List<String> l3 = new ArrayList<String>(); //list 3
        l3.add("Elon Musk");
        l3.add("Jeff Bezos");
        l3.add("Bill Gates");
        l3.add("Larry Ellison");
        l3.add("Larry Page");
        l3.add("Bill Gates"); //duplicate element

      //  List<String> l4 = new ArrayList<String>(); //list 4
        l4.add("Mark Zuckerberg");
        l4.add("Warren Buffett");
        l4.add("Bill Gates");

//        l3.retainAll(l4); //retainAll() used to display common elements elements between 2 ArrayLists
//       System.out.println("Common data between 2 ArrayLists " + l3); //output :  [Bill Gates]
//
//        l3.removeAll(l4); //removeAll() used to remove duplicate elements between 2 ArrayLists
//        System.out.println("Remove duplicate data between 2 ArrayLists " + l3); // output :[Elon Musk, Jeff Bezos]

        //size() used to find ArraySize.);
        System.out.println("Size of the ArrayLIst is " + l3.size());  //output :Size of the ArrayLIst is 6

        //remove all elements from collection object
        l3.clear();
        System.out.println(" After removed all elements from collection object the size is " + l3.size() );
        //output : After removed all elements from collection object the size is 0

    }

}
