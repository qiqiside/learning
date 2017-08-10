package me.learn.DesignPattern.Structural.Bridge;

import me.learn.DesignPattern.utils.Util;

public class Client {

    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction("A");
        abstraction.operation();
        Util.show(abstraction);
        System.out.println();

        RefinedAbstraction refinedAbstraction = new RefinedAbstraction("B");
        refinedAbstraction.doubleOperation();
        Util.show(refinedAbstraction);
    }

}
