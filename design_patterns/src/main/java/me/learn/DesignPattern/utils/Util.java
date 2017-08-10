package me.learn.DesignPattern.utils;

public class Util {

    public static void show(Object o, Object... args) {
        String name = o.getClass().getSimpleName();
        if (name.trim().length() == 0) {
            name = o.getClass().getName();
        }

        StringBuilder str = new StringBuilder(name + "(" + o.hashCode() + ")");

        for (Object item : args) {
            str.append(' ');
            str.append(item.toString());
        }

        System.out.println(str);
    }

}
