package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class convertVectorToLinkedListOrViceVersa {
    public void vector2linkedList(){
        Vector<String> v1 = new Vector<>();
        v1.add("Arni");
        v1.add("Pooja");
        v1.add("Shiva");

        LinkedList<String> l = new LinkedList<>(v1);
        System.out.println("Vector to Linked List " + l);
    }
    public void linkedList2Vector(){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Arni");
        ll.add("Pooja");
        ll.add("Shiva");
        Vector<String> v = new Vector<>(ll);
        System.out.println(" Linked List to Vector " + v);
    }
    public static void main(String[] args) {
       convertVectorToLinkedListOrViceVersa obj = new convertVectorToLinkedListOrViceVersa();
       obj.vector2linkedList();
       obj.linkedList2Vector();
    }

}
