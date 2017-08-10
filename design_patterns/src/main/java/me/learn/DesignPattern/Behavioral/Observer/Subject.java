package me.learn.DesignPattern.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observerList;

    public Subject() {
        observerList = new ArrayList<Observer>();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    void detach(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this, getState());
        }
    }

    public abstract void setState(int state);
    public abstract int getState();

}
