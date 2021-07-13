package JavaBySuresh.Thread;

// To find the Current thread .At least one thread exist in every java program by default that is called as main()
// currentThread() is static method inside Thread class

// To find out thread on thread instance ,getName() will be called
public class Thread1 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread(); //  currentThread() gives thread reference which is currently under execution.
        System.out.println(t1.getName()); // To find out thread on thread instance ,getName() will be called
    }
}
// output : main