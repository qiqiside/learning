package me.learn.DesignPattern.Creational.Singleton;

public class InstantStaticBlockSingleton {

    private static InstantStaticBlockSingleton instance;

    static {
        instance = new InstantStaticBlockSingleton();
    }

    private InstantStaticBlockSingleton() {
        System.out.println("InstantStaticBlockSingleton instantiated");
    }

    public static InstantStaticBlockSingleton getInstance() {
        System.out.println("enter InstantStaticBlockSingleton.getInstance");
        return instance;
    }

}
