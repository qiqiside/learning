package me.learn.DesignPattern.Behavioral.ChainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        Handler handler = new ConcreteHandler1();
        handler = new ConcreteHandler2(handler);
        handler = new ConcreteHandler3(handler);

        handler.handleRequest();
    }

}
