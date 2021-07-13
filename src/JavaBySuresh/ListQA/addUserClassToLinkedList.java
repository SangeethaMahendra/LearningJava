package JavaBySuresh.ListQA;

import java.util.Iterator;
import java.util.LinkedList;

public class addUserClassToLinkedList {
    public static void main(String[] args) {
        LinkedList<Teacher> l = new LinkedList<Teacher>();
        l.add(new Teacher("Sarala", 25000));
        l.add(new Teacher("Bhanu", 24000));
        l.add(new Teacher ("Latha" , 30000));
        Iterator<Teacher> i = l.iterator();
        while(i.hasNext()){
            Teacher t = i.next();
            System.out.println(t.teacherName + " " + t.teacherSalary);
        }
    }

}

class Teacher{
    String teacherName;
    int teacherSalary;

    public Teacher(String teacherName, int teacherSalary) {
        this.teacherName = teacherName;
        this.teacherSalary = teacherSalary;
    }
}
