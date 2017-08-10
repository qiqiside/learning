package me.learn.DesignPattern.Behavioral.Memento;

public class Originator {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(this.state);
        return memento;
    }

}
