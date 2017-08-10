package me.learn.DesignPattern.Creational.FactoryMethod;

public class ConcreteCreator2 implements Creator {

    public Product FactoryMethod() {
        return new ConcreteProduct2();
    }

}
