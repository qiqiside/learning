package me.learn.DesignPattern.Structural.Decorator;

import me.learn.DesignPattern.utils.Util;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        this.addBehavior();
    }

    private void addBehavior() {
        Util.show(this, "add behavior");
    }

}
