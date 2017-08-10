package me.learn.DesignPattern.Creational.Prototype;

public class Shape implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        setName("new shape: " + hashCode());
        return super.clone();
    }

    public String toString() {
        return this.getName();
    }

}
