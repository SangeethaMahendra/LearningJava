package JavaBySuresh.ListQA;

import java.util.Iterator;
import java.util.Vector;

public class addUserClassToVector {
    public static void main(String[] args) {
        Vector<patient> v = new Vector<patient>();
        v.add(new patient("Mani" , 209));
        v.add(new patient("Ravi", 378));
        v.add(new patient("Radha", 100));
        Iterator<patient> i = v.iterator();
        while(i.hasNext()){
            patient p = i.next();
            System.out.println(p.PatientName + " " + p.PatientRecordNo);
        }
    }
}

class patient{
    String PatientName;
    int PatientRecordNo;

    public patient(String patientName, int patientRecordNo) {
       this.PatientName = patientName;
       this.PatientRecordNo = patientRecordNo;
    }
}