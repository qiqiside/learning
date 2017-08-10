package me.learn.DesignPattern.Behavioral.Iterator;

public class Client {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();

        for (int i = 0 ; i < 10 ; i ++) {
            aggregate.add(String.valueOf(i));
        }

        Iterator iterator = aggregate.createIterator();
        for (Object item = iterator.first() ; ! iterator.isDone() ; item = iterator.next()) {
            System.out.print(item.toString() + " ");
        }
        System.out.println();
    }

}
