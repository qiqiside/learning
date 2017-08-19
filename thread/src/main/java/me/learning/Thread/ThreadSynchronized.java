package me.learning.Thread;

import org.junit.Test;

public class ThreadSynchronized {

    private int grassNum = 0;
    private int takeNum = 0;

    void reset() {
        grassNum = 2000;
        takeNum = 0;

        System.out.println("grassNum: " + grassNum);
    }

    int takeGrass() {
        int current = grassNum;
        if (current <= 0)
            return -1;

        grassNum --;
        takeNum ++;

        return current;
    }

    synchronized int safeTakeGrass() {
        return takeGrass();
    }

    class Lamb extends Thread {

        private boolean safeTake = false;

        Lamb(String name, boolean safeTake) {
            super(name);
            this.safeTake = safeTake;
        }

        public void run() {
            while (true) {
                int grass;

                if (safeTake) {
                    grass = ThreadSynchronized.this.safeTakeGrass();
                } else {
                    grass = ThreadSynchronized.this.takeGrass();
                }

                if (grass <= 0)
                    break;

                Common.sleep(10);
            }
        }

    }

    private void aTurn(int lambNum, boolean safeTake) throws InterruptedException {
        Lamb[] lambs = new Lamb[lambNum];

        for (int i = 0 ; i < lambNum ; i ++) {
            lambs[i] = new Lamb("lamb " + i, safeTake);
            lambs[i].start();
        }

        for (int i = 0 ; i < lambNum ; i ++) {
            lambs[i].join();
        }

        System.out.println("takeNum(safeTake = " + safeTake + "): " + takeNum);
    }

    @Test
    public void t() throws InterruptedException {
        int lambNum = 100;

        reset();
        aTurn(lambNum, false);
        reset();
        aTurn(lambNum, true);

        synchronized (this) {
            System.out.println("\nusage 2.");
        }
    }

}
