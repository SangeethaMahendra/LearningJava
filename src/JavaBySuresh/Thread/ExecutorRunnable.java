package JavaBySuresh.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorRunnable implements Runnable{ //design thread by implements Runnable interface
    @Override     //override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2); ////Create Thread pool with any number of thread in a pool
        es.submit(new ExecutorRunnable()); ////submit() used to register your task/intimate about your task to ExecutorService

    }
}
// Output 1
//2
//3
//4
//5