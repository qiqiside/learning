package me.learn.DesignPattern.Creational.Singleton;

public class StaticInnerClassSingleton {

    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
        System.out.println("StaticInnerClassSingleton instantiated");
    }

    public static final StaticInnerClassSingleton getInstance() {
        System.out.println("enter StaticInnerClassSingleton.getInstance");
        return SingletonHolder.INSTANCE;
    }

}
