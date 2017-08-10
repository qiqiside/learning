package me.learn.DesignPattern.Behavioral.Visitor;

import me.learn.DesignPattern.utils.Util;

public class ConcreteVisitor1 implements Visitor {

    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        Util.show(this, "visitConcreteElementA");
        concreteElementA.operationA();
    }

    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        Util.show(this, "visitConcreteElementB");
        concreteElementB.operationB();
    }

}
