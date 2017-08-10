package me.learn.DesignPattern.Behavioral.ChainOfResponsibility;

public class Handler {

    private Handler successor;

    public Handler() {
    }

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest() {
        if (successor != null) {
            successor.handleRequest();
        }
    }

}
