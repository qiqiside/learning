package me.learn.DesignPattern.Structural.Proxy;

public class Client {

    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
        System.out.println();

        proxy = new ReflectProxy().getProxy();
        proxy.request();
        System.out.println();

        proxy = new CglibProxy().getProxy();
        proxy.request();
    }

}
