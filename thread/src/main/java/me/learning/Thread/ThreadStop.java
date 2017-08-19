package me.learning.Thread;

import org.junit.Test;

public class ThreadStop {

    class BlackLamb extends Thread {

        private volatile boolean stopped = false;

        BlackLamb(String name) {
            super(name);
        }

        void setStopped() {
            stopped = true;
        }

        public void run() {
            int count = 0;

            while (! stopped) {
                Common.lambMee(count);
                count ++;

                Common.sleep(1000);
            }

            System.out.println(this.getName() + ": bye");
        }
    }

    class WhiteLamb extends Thread {

        WhiteLamb(String name) {
            super(name);
        }

        public void run() {
            int count = 0;

            while (! isInterrupted()) {
                Common.lambMee(count);
                count ++;

                Common.sleep(1000);
            }

            System.out.println(this.getName() + ": bye");
        }
    }

    @Test
    public void t() throws InterruptedException {
        BlackLamb blackLamb = new BlackLamb("black lamb");
        blackLamb.start();

        WhiteLamb whiteLamb = new WhiteLamb(("white lamb"));
        whiteLamb.start();

        Common.sleep(4000);
        blackLamb.setStopped();
        whiteLamb.interrupt();

        blackLamb.join();
        whiteLamb.join();
    }

}
