package JavaBySuresh.garbageCollector;

import JavaBySuresh.garbageCollector.GarbageCollectorDemo;

public class RemoveGCNull {
    public static void main(String[] args) {
        GarbageCollectorDemo s = new GarbageCollectorDemo();
        s.disp();
       s = null; // Marking as un-used object// finalize method works only if ref variable assigned as a null
        //check  GarbageCollectorDemo class for finalize method
        System.gc(); // calling GC to remove Object


    }
}
