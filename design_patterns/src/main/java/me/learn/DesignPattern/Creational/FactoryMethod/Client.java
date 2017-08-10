package me.learn.DesignPattern.Creational.FactoryMethod;

import me.learn.DesignPattern.utils.Util;

public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator1();
        Util.show(creator);
        Product product = creator.FactoryMethod();
        Util.show(product);

        creator = new ConcreteCreator2();
        Util.show(creator);
        product = creator.FactoryMethod();
        Util.show(product);

        TemplateCreator templateCreator = new TemplateCreator();
        Util.show(templateCreator);
        product = templateCreator.FactoryMethod(ConcreteProduct1.class);
        Util.show(product);
        product = templateCreator.FactoryMethod(ConcreteProduct2.class);
        Util.show(product);
    }

}
