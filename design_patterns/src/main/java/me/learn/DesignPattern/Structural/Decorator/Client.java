package me.learn.DesignPattern.Structural.Decorator;

public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecoratorA(component);
        decorator.operation();
        System.out.println();

        component = new ConcreteComponent();
        decorator = new ConcreteDecoratorB(component);
        decorator.operation();
    }

}
