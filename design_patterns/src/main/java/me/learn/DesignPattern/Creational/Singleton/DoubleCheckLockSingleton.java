package me.learn.DesignPattern.Creational.Singleton;

public class DoubleCheckLockSingleton {

    private static volatile DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton() {
        System.out.println("DoubleCheckLockSingleton instantiated");
    }

    public static DoubleCheckLockSingleton getInstance() {
        System.out.println("enter DoubleCheckLockSingleton.getInstance");

        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }

        return instance;
    }

}
