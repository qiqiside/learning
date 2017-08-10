package me.learn.DesignPattern.Behavioral.ChainOfResponsibility;

import me.learn.DesignPattern.utils.Util;

public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2() {
        super();
    }

    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    public void handleRequest() {
        Util.show(this, "handleRequest");

        super.handleRequest();
    }

}
