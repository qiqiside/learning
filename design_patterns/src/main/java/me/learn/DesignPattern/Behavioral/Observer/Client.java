package me.learn.DesignPattern.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        List<Observer> observerList = new ArrayList<Observer>();

        for (int i = 0 ; i < 5 ; i ++) {
            Observer observer = new ConcreteObserver();
            observerList.add(observer);
            subject.attach(observer);
        }

        subject.setState(10);
        System.out.println();

        Observer observer = observerList.get(observerList.size() / 2);
        observerList.remove(observer);
        subject.detach(observer);

        subject.setState(5);
    }

}
