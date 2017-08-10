package me.learn.DesignPattern.Behavioral.Visitor;

import me.learn.DesignPattern.utils.Util;

public class ConcreteElementA implements Element {

    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {
        Util.show(this, "operationA");
    }

}
