package me.learn.DesignPattern.Creational.Singleton;

import me.learn.DesignPattern.utils.Util;

public class Client {

    public static void main(String[] args) {
        LazyLoadSingleton lazyLoadSingleton = LazyLoadSingleton.getInstance();
        Util.show(lazyLoadSingleton);
        lazyLoadSingleton = LazyLoadSingleton.getInstance();
        Util.show(lazyLoadSingleton);
        System.out.println();

        InstantSingleton instantSingleton = InstantSingleton.getInstance();
        Util.show(instantSingleton);
        instantSingleton = InstantSingleton.getInstance();
        Util.show(instantSingleton);
        System.out.println();

        InstantStaticBlockSingleton instantStaticBlockSingleton = InstantStaticBlockSingleton.getInstance();
        Util.show(instantStaticBlockSingleton);
        instantStaticBlockSingleton = InstantStaticBlockSingleton.getInstance();
        Util.show(instantStaticBlockSingleton);
        System.out.println();

        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        Util.show(staticInnerClassSingleton);
        staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        Util.show(staticInnerClassSingleton);
        System.out.println();

        DoubleCheckLockSingleton doubleCheckLockSingleton = DoubleCheckLockSingleton.getInstance();
        Util.show(doubleCheckLockSingleton);
        doubleCheckLockSingleton = DoubleCheckLockSingleton.getInstance();
        Util.show(doubleCheckLockSingleton);
        System.out.println();

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        Util.show(enumSingleton);
        enumSingleton.f();
        enumSingleton = EnumSingleton.INSTANCE;
        Util.show(enumSingleton);
        enumSingleton.f();
    }

}
