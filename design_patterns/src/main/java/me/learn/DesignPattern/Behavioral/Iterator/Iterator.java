package me.learn.DesignPattern.Behavioral.Iterator;

public interface Iterator {

    Object first();
    Object next();
    Boolean isDone();
    Object currentItem();

}
