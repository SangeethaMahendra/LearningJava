package JavaBySuresh.Thread;

// // Multi Thread creation using "	extends Thread class"
public class ExtendsThreadClass extends Thread{ // 1. develop a class which extends "Thread" class
    public void run(){ //2. over-ride "Thread" class run()
            for(int i = 1; i<=5; i++)  // 3. write logic as part of run()
            {
                System.out.println(i);
            }
    }
    public static void main(String[] args) {
          ExtendsThreadClass obj = new ExtendsThreadClass(); // 4. create an object to your class
          obj.start(); //5.  call start()

    }
}
// output:  1
//2
//3
//4
//5
