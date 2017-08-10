package me.learn.DesignPattern.Structural.Composite;

public abstract class Component {

    public abstract void operation();

    public void add(Component component) {}
    public void remove(Component component) {}
    public Component getChild(int index) { return null; }

}
