package me.learn.DesignPattern.Behavioral.State;

public class Context {

    private State state = new ConcreteState1();

    public void handle() {
        state = state.handle(this);
    }

    public State getState() {
        return state;
    }

}
