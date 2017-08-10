package me.learn.DesignPattern.Structural.Decorator;

public class Decorator {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }

}
