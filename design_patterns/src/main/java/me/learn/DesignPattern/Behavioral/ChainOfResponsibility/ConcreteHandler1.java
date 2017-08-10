package me.learn.DesignPattern.Behavioral.ChainOfResponsibility;

import me.learn.DesignPattern.utils.Util;

public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1() {
        super();
    }

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    public void handleRequest() {
        Util.show(this, "handleRequest");

        super.handleRequest();
    }

}
