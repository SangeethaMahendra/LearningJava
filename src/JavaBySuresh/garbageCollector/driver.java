package JavaBySuresh.garbageCollector;

public class driver {

    public static void main(String[] args) {

        //It is called Named Object
        //GarbageCollectorDemo e = new GarbageCollectorDemo();
       // e.disp();

        // This is called Anonymous Object
        new GarbageCollectorDemo().disp();  // output am from GarbageCollectorDemo ----->
        new GarbageCollectorDemo().show();
        //since it has no ref variable it automatically called for gc. no need of using null value
        System.gc();

        GarbageCollectorDemo e = new GarbageCollectorDemo();
        e.disp();
        e.show();
    }
}
