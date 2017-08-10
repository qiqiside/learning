package me.learn.DesignPattern.Structural.Adapter;

public class ClassAdapter extends Adaptee implements Target {

    public void request(Integer id) {
        this.specificRequest(id.toString());
    }

}
