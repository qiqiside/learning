package me.learning.Thread;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadWaitAndSignal {

    public class Yard extends Thread {

        private List<Grass> grassList;
        private volatile boolean quit;

        Yard() {
            super();

            grassList = new ArrayList<Grass>();
        }

        void setQuit() {
            quit = true;
        }

        synchronized void add(Grass grass) {
            grassList.add(grass);
        }

        private Grass findGrass() {
            Grass grass = null;
            for (Grass item : grassList) {
                if (item.isGrown()) {
                    grass = item;
                    break;
                }
            }

            if (grass != null) {
                    grassList.remove(grass);
            }

            return grass;
        }

        synchronized Grass eatGrass() {
            while (! quit) {
                Grass grass = findGrass();
                if (grass != null)
                    return grass;

                try {
                    wait(1000);
                } catch (InterruptedException e) {
//                    e.printStackTrace();
                    return null;
                }
            }

            return null;
        }


        synchronized void grassIsGrown() {
            notifyAll();
        }

        public void run() {
            Integer grassNo = 1;

            while (! quit) {
                int sleepTime = Common.nextInt(3000);
                int grassNum = Common.nextInt(3);

                Common.sleep(sleepTime);

                for (int i = 0 ; i < grassNum ; i ++) {
                    Grass grass = new Grass("#" + grassNo.toString(), this);
                    add(grass);

                    grass.start();

//                    System.out.println("caught a grass seek #" + grassNo);

                    grassNo ++;
                }
            }

            System.out.println("yard closed");
        }
    }

    public class Grass extends Thread {

        private boolean isGrown = false;
        private Yard yard;

        Grass(String name, Yard yard) {
            super(name);
            this.yard = yard;
            this.setDaemon(true);
        }

        boolean isGrown() {
            return isGrown;
        }

        public void run() {
            Common.sleep(Common.nextInt(3000));
            isGrown = true;

            yard.grassIsGrown();
        }
    }

    public class Lamb extends Thread {

        private Yard yard;
        private volatile boolean quit;

        Lamb(String name, Yard yard) {
            super(name);
            this.yard = yard;
        }

        void setQuit() {
            quit = true;
        }

        public void run() {
            while (! quit) {
                Grass grass = yard.eatGrass();

                if (grass != null) {
                    System.out.println(this.getName() + " eat a " + grass.getName() + " grass!");
                }
            }

            System.out.println(this.getName() + " is gone");
        }
    }

    @Test
    public void t() {
        String[] lambNames = { "white lamb", "dotted lamb", "long wool lamb" };
        Thread[] everything = new Thread[lambNames.length + 1];

        Yard yard = new Yard();
        everything[0] = yard;

        for (int i = 0 ; i < lambNames.length ; i ++) {
            Lamb lamb = new Lamb(lambNames[i], yard);
            everything[i + 1] = lamb;
        }

        try {
            for (int i = 0 ; i < lambNames.length + 1 ; i ++) {
                everything[i].start();
            }

            Common.sleep(15000);

            for (int i = 0 ; i < lambNames.length + 1 ; i ++) {
                if (i == 0) {
                    ((Yard) everything[i]).setQuit();
                } else {
                    ((Lamb) everything[i]).setQuit();
                }
            }

            for (int i = 0 ; i < lambNames.length + 1 ; i ++) {
                everything[i].join();
            }

            ThreadGroup threadGroup = new ThreadGroup("a");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
