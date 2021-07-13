package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedListOrViceVersa {
    public void linkedList(){
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Arni");
        l1.add("Pooja");
        l1.add("Shiva");
        LinkedList<String> l = new LinkedList<>(l1);
        System.out.println("ArrayList to LinkedList " + l);
    }

    public void arrayList(){
        LinkedList<String> v1 = new LinkedList<>();
        v1.add("Arni");
        v1.add("Pooja");
        v1.add("Shiva");
        ArrayList<String> al = new ArrayList<>(v1);
        System.out.println(" LinkedList to ArrayList " + al);
    }
    public static void main(String[] args) {
        ArrayListToLinkedListOrViceVersa obj = new ArrayListToLinkedListOrViceVersa();
        obj.linkedList();
        obj.arrayList();
    }

}
