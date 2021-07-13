package JavaBySuresh.Thread;


public class anonymousRunnable {
    public static void main(String[] args) {
       Runnable r = new Runnable() { //  create Anonymous class with Runnable interface
           @Override
           public void run() {
               for(int i=1;i<=5;i++)
               {
                   System.out.println(i);
               }
           }
       };
       Thread t = new Thread(r);
       t.start();
    }
}
// output 1
//2
//3
//4
//5