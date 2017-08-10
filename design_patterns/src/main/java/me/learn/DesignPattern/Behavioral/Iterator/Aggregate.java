package me.learn.DesignPattern.Behavioral.Iterator;

public interface Aggregate {

    void add(Object o);
    Object remove(int index);
    Object get(int index);
    int size();

    Iterator createIterator();

}
