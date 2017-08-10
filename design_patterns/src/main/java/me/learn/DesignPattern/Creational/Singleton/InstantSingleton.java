package me.learn.DesignPattern.Creational.Singleton;

public class InstantSingleton {

    private static InstantSingleton instance = new InstantSingleton();

    private InstantSingleton() {
        System.out.println("InstantSingleton instantiated");
    }

    public static InstantSingleton getInstance() {
        System.out.println("enter InstantSingleton.getInstance");
        return instance;
    }

}
