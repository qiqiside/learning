package me.learn.DesignPattern.Behavioral.Observer;

import me.learn.DesignPattern.utils.Util;

public class ConcreteObserver implements Observer {

    private int observerState;

    public void update(Subject subject, int state) {
        this.observerState = state;
        Util.show(this, "update state", state);
    }

    public int getObserverState() {
        return observerState;
    }

}
