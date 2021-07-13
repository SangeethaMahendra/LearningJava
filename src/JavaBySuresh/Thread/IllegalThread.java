package JavaBySuresh.Thread;

//suppose we will start thread multiple times then we will get "IllegalThreadStateException"
public class IllegalThread extends Thread{  // 1.  develop a class which extends "Thread" class
    public void run(){ //2. over-ride "Thread" class run()
        for(int i = 1; i<=5; i++)  // 3. write logic as part of run()
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
      IllegalThread obj = new IllegalThread(); // 4. create an object to your class
        obj.start(); //5.  call start()
        obj.start(); // 6. we can't start thread twice/multiple times; we will get "IllegalThreadStateException"

    }
}

//output : Exception in thread "main" java.lang.IllegalThreadStateException
//	at java.base/java.lang.Thread.start(Thread.java:791)
//	at JavaBySuresh.Thread.IllegalThread.main(IllegalThread.java:14)