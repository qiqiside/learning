package me.learn.DesignPattern.Creational.Prototype;

import me.learn.DesignPattern.utils.Util;

public class Client {

    public static void main(String[] args) {
        try {
            Object object = new Shape().clone();
            Util.show(object);
            System.out.println("name: " + object.toString());

            object = new Shape().clone();
            Util.show(object);
            System.out.println("name: " + object.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
