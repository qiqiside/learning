package me.learn.DesignPattern.Structural.Bridge;

public class Abstraction {

    private Implementor implementor;

    public Abstraction(String whichOne) {
        if (whichOne.equals("A")) {
            implementor = new ConcreteImplementorA();
        } else {
            implementor = new ConcreteImplementorB();
        }
    }

    public void operation() {
        implementor.operationImp();
    }

}
