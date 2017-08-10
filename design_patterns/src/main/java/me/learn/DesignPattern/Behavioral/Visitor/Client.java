package me.learn.DesignPattern.Behavioral.Visitor;

public class Client {

    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor1();

        ObjectStructure objectStructure = new ObjectStructure();

        for (int i = 0 ; i < 4 ; i ++) {
            Element element = ((i & 2) == 0) ? new ConcreteElementA() : new ConcreteElementB();
            objectStructure.add(element);
        }

        objectStructure.visit(visitor);
        System.out.println();

        visitor = new ConcreteVisitor2();
        objectStructure.visit(visitor);
    }

}
