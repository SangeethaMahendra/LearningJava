package JavaBySuresh.Thread;
//class with out name is called anonymous class
//compiler will decide name for anonymous class at compilation time
// by using the anonymous class without extending a Thread class
public class anonymousClass {

    public static void main(String[] args) {
        Thread t = new Thread() // Create a method inside
        {
          public void run(){
              for(int i=1;i<=5;i++)
              {
                  System.out.println(i);
              }
          }
        };
        t.start();
    }
}
//output 1
//2
//3
//4
//5