package me.learning.Thread;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutors {

    @Test
    public void t1() {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10 ; i ++) {
            final int index = i;

            executorService.execute(new Runnable() {
                public void run() {
                    Common.sleep(100 * index + 1);
                    System.out.println(Thread.currentThread().getName() + ": index = " + index);
                }
            });
        }

        Common.join();
    }

    @Test
    public void t2() {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10 ; i ++) {
            final int index = i;

            executorService.execute(new Runnable() {
                public void run() {
                    Common.sleep(100 * index + 1);
                    System.out.println(Thread.currentThread().getName() + ": index = " + index);
                }
            });
        }

        Common.join();
    }

}
