package callable_asynchronous;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Long> {

    int num;

    public CallableDemo(int num) {
        this.num = num;
    }

    @Override
    public Long call() throws Exception {
        long fact = 1;
        for (int count = num; count > 1; count--) {
            fact *= count;
        }
        return fact;
    }
}
