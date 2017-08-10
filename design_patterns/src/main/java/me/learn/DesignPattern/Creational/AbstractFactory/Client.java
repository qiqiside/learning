package me.learn.DesignPattern.Creational.AbstractFactory;

import me.learn.DesignPattern.utils.Util;

public class Client {

    public static void main(String[] args) {
        AbstractProductA productA;
        AbstractProductB productB;

        AbstractFactory factory1 = new ConcreteFactory1();
        Util.show(factory1,"created");

        productA = factory1.createProductA();
        productB = factory1.createProductB();
        Util.show(productA, "created");
        Util.show(productB, "created");

        AbstractFactory factory2 = new ConcreteFactory2();
        Util.show(factory2,"created");

        productA = factory2.createProductA();
        productB = factory2.createProductB();
        Util.show(productA, "created");
        Util.show(productB, "created");
    }

}
