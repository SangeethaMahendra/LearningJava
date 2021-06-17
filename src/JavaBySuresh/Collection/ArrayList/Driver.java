package JavaBySuresh.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        //Basic initialization of array using primitive type
        //int  i[] = {1,2,3,4,5};
       //Collection only supports object
        List l = new ArrayList(); //Creating ArrayList object
        l.add(1); // int; add() method use to add objects at end of the collection object . it accepts all primitive/null/duplicate values
        l.add("Sunitha");  //String;
        l.add(true); //boolean
        l.add(null); //null
        l.add(true); // duplicate
        System.out.println(l); //output : [1, Sunitha, true, null, true]
    }
}
