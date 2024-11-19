package runnable_synchronous;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableMain {
    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
//            Thread t = new Thread(r);
//    t.start(); // or below code
        ExecutorService exe = Executors.newFixedThreadPool(5);
        exe.submit(r);
        exe.shutdown();
    }
}
