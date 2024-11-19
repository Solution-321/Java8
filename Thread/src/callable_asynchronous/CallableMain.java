package callable_asynchronous;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableDemo c = new CallableDemo(5);
        ExecutorService exe = Executors.newFixedThreadPool(5);
        Future<Long> res = exe.submit(c);
        System.out.println(res.get());
        exe.shutdown();
    }
}
