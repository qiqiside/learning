package me.learn.DesignPattern.Behavioral.Strategy;

public class Client {

    public static void main(String[] args) {
        Context context = new Context("ConcreteStrategy1");
        context.contextInterface();
        System.out.println();

        context = new Context("ConcreteStrategy2");
        context.contextInterface();
        System.out.println();

        context = new Context("ConcreteStrategy3");
        context.contextInterface();
        System.out.println();
    }

}
