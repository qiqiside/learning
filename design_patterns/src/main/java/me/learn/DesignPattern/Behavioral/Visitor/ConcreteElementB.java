package me.learn.DesignPattern.Behavioral.Visitor;

import me.learn.DesignPattern.utils.Util;

public class ConcreteElementB implements Element {

    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB() {
        Util.show(this, "operationB");
    }

}
