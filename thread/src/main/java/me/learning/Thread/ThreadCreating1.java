package me.learning.Thread;

import org.junit.Test;

public class ThreadCreating1 {

    public class Lamb extends Thread {

        Lamb(String name) {
            super(name);
        }

        public void run() {
            Common.lambMee();
        }
    }

    @Test
    public void t() throws InterruptedException {
        Lamb lamb = new Lamb("a lamb");
        lamb.start();
        lamb.join();
    }

}
