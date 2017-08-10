package me.learn.DesignPattern.Behavioral.Memento;

import me.learn.DesignPattern.utils.Util;

public class Client {

    public static void main(String[] args) {
        int state;

        Originator originator = new Originator();

        state = 50;
        originator.setState(state);
        Util.show(originator, "set state to " + originator.getState());

        Memento memento = originator.createMemento();

        state = 100;
        originator.setState(state);
        Util.show(originator, "set state to " + originator.getState());

        originator.setMemento(memento);
        Util.show(originator, "restore state to " + originator.getState());
    }

}
