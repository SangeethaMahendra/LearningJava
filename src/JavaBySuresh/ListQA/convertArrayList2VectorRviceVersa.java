package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class convertArrayList2VectorRviceVersa {
    public void vector(){
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");

        Vector<String> v = new Vector<>(l1);
        System.out.println("ArrayList to Vector " + v);
    }
    public void arrayList(){
        Vector<String> v1 = new Vector<>();
        v1.add("Arni");
        v1.add("Pooja");
        v1.add("Shiva");
        ArrayList<String> l = new ArrayList<>(v1);
        System.out.println("Vector to ArrayList " + l);
    }
    public static void main(String[] args) {
         convertArrayList2VectorRviceVersa obj = new convertArrayList2VectorRviceVersa();
         obj.vector();
         obj.arrayList();
    }
}
