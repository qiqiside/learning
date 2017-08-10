package me.learn.DesignPattern.Behavioral.Iterator;

public class ConcreteIterator implements Iterator {

    private Aggregate aggregate;
    private int index;

    public ConcreteIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
        index = -1;
    }

    private Object get(int idx) {
        if (idx >= aggregate.size())
            return null;

        return aggregate.get(idx);
    }

    public Object first() {
        index = 0;
        return get(index);
    }

    public Object next() {
        index ++;
        return get(index);
    }

    public Boolean isDone() {
        return index >= aggregate.size();
    }

    public Object currentItem() {
        return get(index);
    }

}
