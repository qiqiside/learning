package me.learn.DesignPattern.Structural.Adapter;

public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter() {
        adaptee = new Adaptee();
    }

    public void request(Integer id) {
        adaptee.specificRequest(id.toString());
    }

}
