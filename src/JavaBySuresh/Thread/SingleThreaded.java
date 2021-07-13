package JavaBySuresh.Thread;

// Single Threaded because the execution starts with main method and goes in sequence, and only one single thread
// each of the method has their own method space , but the execution is sequential. no multi thread is involved
public class SingleThreaded {
    void run(){    // method 1 will executed first
         for(int i = 1; i<= 200; i++){
            System.out.println("i" + i);
        }
    }
    public static void main(String[] args) {
        SingleThreaded st = new SingleThreaded();
        st.run();

        for(int j =1 ; j<=200; j++){  // This will get executed after first method
            System.out.println("j" + j);
        }
    }
}
