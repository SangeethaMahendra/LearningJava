package JavaBySuresh.Thread;
// ExecutorService is used for thread re-usability

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorService  extends Thread{
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ExecutorService es  = Executors.newFixedThreadPool(10); //Create Thread pool
        es.submit(new executorService()); //submit() used to register your task/intimate about your task to ExecutorService


    }

}
