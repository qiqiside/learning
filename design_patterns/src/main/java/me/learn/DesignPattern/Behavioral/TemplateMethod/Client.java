package me.learn.DesignPattern.Behavioral.TemplateMethod;

public class Client {

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.templateMethod();
    }

}
