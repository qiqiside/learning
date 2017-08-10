package me.learn.DesignPattern.Behavioral.Observer;

import me.learn.DesignPattern.utils.Util;

public class ConcreteSubject extends Subject {
    private int subjectState;

    public void setState(int state) {
        Util.show(this, "set state", state);
        this.subjectState = state;
        this.notifyObservers();
    }

    public int getState() {
        return this.subjectState;
    }
}
