package me.learn.DesignPattern.Structural.Bridge;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(String whichOne) {
        super(whichOne);
    }

    public void doubleOperation() {
        operation();
        operation();
    }

}
