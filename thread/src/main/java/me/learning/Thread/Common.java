package me.learning.Thread;

import java.util.Random;

public class Common {

    public final static int COUNT = 10;

    public static void lambMee(int count) {
        StringBuilder sb = new StringBuilder();

        for (int j = 0 ; j <= count ; j ++) {
            if (j > 0) {
                sb.append(", ");
            }

            sb.append("mee");
        }

        System.out.println(Thread.currentThread().getName() + ": " + sb.toString());
    }

    public static void lambMee() {
        for (int i = 0 ; i < COUNT ; i ++) {
            lambMee(i);
            sleep(1000);
        }
    }

    public static void sleep(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }
    }

    public static void listThreads() {
        System.out.println("\nThread.activeCount = " + Thread.activeCount());

        Thread[] threads = new Thread[Thread.activeCount()];
        Thread.enumerate(threads);

        for (Thread thread : threads) {
            System.out.println("-- " + thread.getName());
        }
    }

    public static void join() {
        final int period = 100;
        int count = 0;

        while (Thread.activeCount() > 2) {
            sleep(100);

            count ++;
            if (count % period == 0) {
                listThreads();
            }
        }

        if (count == 0) {
            listThreads();
        }
    }

    public static int nextInt(int max) {
        try {
            Random random = new Random();
            return random.nextInt(max);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

}
