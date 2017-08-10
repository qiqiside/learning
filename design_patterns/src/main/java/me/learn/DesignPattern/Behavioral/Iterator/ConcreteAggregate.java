package me.learn.DesignPattern.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {

    private List<Object> elementList;

    public ConcreteAggregate() {
        elementList = new ArrayList<Object>();
    }

    public void add(Object o) {
        elementList.add(o);
    }

    public Object remove(int index) {
        return elementList.remove(index);
    }

    public Object get(int index) {
        return elementList.get(index);
    }

    public int size() {
        return elementList.size();
    }

    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

}
