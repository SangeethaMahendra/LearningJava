package JavaBySuresh.Thread;
//"Runnable" is an functional interface which contains single abstract method called as run()

public class RunnableInterface implements Runnable {  // 1. design class which implements "Runnable" interface

    public void run() { //2. over-ride "Thread" class run()
        for (int i = 1; i <= 5; i++)  // 3. write logic as part of run()
        {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        RunnableInterface ri = new RunnableInterface(); // 4. create your class object
        Thread t = new Thread(ri); // 6. and pass to Thread class constructor;
        t.start(); // 7. call start() on thread instance
    }
}
// output :12345