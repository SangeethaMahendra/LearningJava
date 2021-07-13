package JavaBySuresh.Thread;

import java.util.concurrent.*;

public class CallableInterface implements Callable { //design class which implements Callable interface

    public String call(){ //over-ride call() and write logic as part of call()
        String s1 = "SM";
        String s2 = "MS";
        boolean flag = s1.equals(s2);
        if(flag){
            return "2 objects are equal-->";
        }
        else{
            return "2 objects are not equal-->";
        }
    }
//    @Override
//    public Object call() throws Exception { //This method is over-ridden above
//        return null;
//    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10); ////Create Thread pool
        Future<String> f = es.submit(new CallableInterface()); ////submit() used to register your task/intimate about your task to ExecutorService
        System.out.println(f.get()); //call get() on "future" object to get desired result


    }
}
