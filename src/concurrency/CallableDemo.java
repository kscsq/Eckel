package concurrency;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by kscsq on 30.01.2017.
 */

class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }
}

    public class CallableDemo {
        public static void main(String[] args) {
            ExecutorService exec = Executors.newCachedThreadPool();
        }
    }

