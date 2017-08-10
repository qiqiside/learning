package me.learn.DesignPattern.Behavioral.Command;

public class ConcreteCommand implements Command {

    private Receiver receiver;
    private char key;
    private int changeState;

    public ConcreteCommand(Receiver receiver, char key) {
        this.receiver = receiver;
        this.key = key;
    }

    public void execute() {
        this.receiver.action(Receiver.TYPE_SEND, key);
        changeState = 1;
    }

    public void unexecute() {
        if (this.changeState != 1)
            return;

        this.receiver.action(Receiver.TYPE_CANCEL, key);
        this.changeState = 0;
    }
}
