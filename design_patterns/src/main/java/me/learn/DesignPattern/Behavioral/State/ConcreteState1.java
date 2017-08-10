package me.learn.DesignPattern.Behavioral.State;

public class ConcreteState1 implements State {

    public State handle(Context context) {
        return new ConcreteState2();
    }

}
