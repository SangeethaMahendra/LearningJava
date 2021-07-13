package JavaBySuresh.ListQA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class addUserClassToArrayList {
    public static void main(String[] args) {
       List<Student> al = new ArrayList<Student>();
      al.add(new Student(100, "Sanjana"));
      al.add(new Student(98, "Akishithi"));
      al.add(new Student(99, " Oviya"));
      Iterator<Student> l = al.iterator();
      while(l.hasNext()){
          Student s = l.next();
          System.out.println(s.StudentName + " " + s.StudentMark);
      }

    }
}

    class Student {
        int StudentMark;
        String StudentName;
        public Student(int StudentMark, String StudentName) {
            this.StudentMark = StudentMark;
            this.StudentName = StudentName;
        }
    }
