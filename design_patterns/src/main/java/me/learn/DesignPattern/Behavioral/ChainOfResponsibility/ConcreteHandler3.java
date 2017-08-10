package me.learn.DesignPattern.Behavioral.ChainOfResponsibility;

import me.learn.DesignPattern.utils.Util;

public class ConcreteHandler3 extends Handler {

    public ConcreteHandler3() {
        super();
    }

    public ConcreteHandler3(Handler successor) {
        super(successor);
    }

    public void handleRequest() {
        Util.show(this, "handleRequest");

        super.handleRequest();
    }

}
