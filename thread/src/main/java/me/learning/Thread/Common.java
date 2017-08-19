package me.learning.Thread;

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
            e.printStackTrace();
        }
    }

}
