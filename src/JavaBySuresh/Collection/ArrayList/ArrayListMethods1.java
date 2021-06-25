package JavaBySuresh.Collection.ArrayList;

import java.util.*;

// Collections.unmodifiableList(), contains() , uniqueList.contains(), uniqueList.add()
public class ArrayListMethods1 {

   // Req:How to make ArrayList as immutable?
    void immuteAL(){
       List<String> l1 = new ArrayList<String>(); //list 1
        l1.add("Elon Musk");
        l1.add("Jeff Bezos");
        l1.add("Bill Gates");
        List<String> unmodifiableList = Collections.unmodifiableList(l1);
        unmodifiableList.add("Praveen"); //output: UnsupportedOperationException - throws error
        //"UnsupportedOperationException" occurs whenever we will try to perform any operation on immutable collection object.
    }
    //How to check whether particular elements exist or not in given collection?
    void elementExist(){
        List<String> l2 = new ArrayList<String>(); //list 2
       // String name ="Bill Gates";//Using String
        l2.add("Elon Musk");
        l2.add("Jeff Bezos");
        l2.add("Bill Gates");
        //Boolean flag = l2.contains(name);
        Boolean flag = l2.contains("Praveen"); // can give string directly
        System.out.println(flag);
    }
     //Req:How to remove duplicates from ArrayList? - uniqueList
    void removeDuplicates(){
        List<String> l3 = new ArrayList<String>(); //list 2
        List<String> uniqueList = new ArrayList<String>();
        l3.add("Elon Musk");
        l3.add("Jeff Bezos");
        l3.add("Bill Gates");
        l3.add("Jeff Bezos"); //duplicate
        for(String temp:l3){
            if(!uniqueList.contains(temp)){
                uniqueList.add(temp);
            }
        }
        System.out.println(uniqueList); //[Elon Musk, Jeff Bezos, Bill Gates]


    }
      // Convert array to ArrayList Using as.list
    void convertArrayToArrayList1(){
        String[] str= {"A","B","C"};
        List<String> al = Arrays.asList(str);
        System.out.println("Convert array to ArrayList using as.list");
        System.out.println(al);
    }

    // Convert array to ArrayList Using enhanced for loop
    void convertArrayToArrayList2() {
        String[] str1 = {"A", "B", "C"};
        ArrayList<String> a1 = new ArrayList<String>();
        System.out.println("Convert array to ArrayList using enhanced for loop ");
        for (String t : str1) {
            a1.add(t);
        }
        System.out.println(a1);
    }

    //Convert ArrayList to array
    void convertArrayListToArray(){
        List<String> al=new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        String[] s=al.toArray(new String[al.size()]);
        System.out.println("Convert Array List to Array");
        for(String temp:s)
        {
            System.out.println(temp);
        }

    }
    public static void main(String[] args) {
       ArrayListMethods1 obj = new ArrayListMethods1();
       //obj.immuteAL();
       obj.elementExist();
       obj.removeDuplicates();
       obj.convertArrayToArrayList1();
       obj.convertArrayToArrayList2();
       obj.convertArrayListToArray();
    }
}

