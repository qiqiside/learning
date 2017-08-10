package me.learn.DesignPattern.Structural.Decorator;

import me.learn.DesignPattern.utils.Util;

public class ConcreteDecoratorB extends Decorator {

    private Integer state;

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        this.addState();
    }

    private void addState() {
        this.state = 1;
        Util.show(this, "add state", this.state);
    }

}
