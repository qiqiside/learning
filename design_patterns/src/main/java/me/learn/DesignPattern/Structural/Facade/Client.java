package me.learn.DesignPattern.Structural.Facade;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.operationA();
        System.out.println();

        facade.operationB();
    }

}
