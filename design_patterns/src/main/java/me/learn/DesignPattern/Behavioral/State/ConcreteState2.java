package me.learn.DesignPattern.Behavioral.State;

public class ConcreteState2 implements State {

    public State handle(Context context) {
        return new ConcreteState1();
    }

}
