package me.learning.Thread;

import org.junit.Test;

public class ThreadCreating2 {

    class Lamb implements Runnable {

        public void run() {
            Common.lambMee();
        }
    }

    @Test
    public void t() throws InterruptedException {
        Thread lamb = new Thread(new Lamb(), "a lamb");
        lamb.start();
        lamb.join();
    }

}
