package me.learn.DesignPattern.Creational.Singleton;

public class LazyLoadSingleton {

    private static LazyLoadSingleton instance;

    private LazyLoadSingleton() {
        System.out.println("LazyLoadSingleton instantiated");
    }

    public synchronized static LazyLoadSingleton getInstance() {
        System.out.println("enter LazyLoadSingleton.getInstance");

        if (instance == null) {
            instance = new LazyLoadSingleton();
        }

        return instance;
    }

}
