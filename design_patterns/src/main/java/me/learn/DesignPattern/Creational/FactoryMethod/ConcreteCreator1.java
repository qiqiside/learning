package me.learn.DesignPattern.Creational.FactoryMethod;

public class ConcreteCreator1 implements Creator {

    public Product FactoryMethod() {
        return new ConcreteProduct1();
    }

}
