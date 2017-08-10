package me.learn.DesignPattern.Structural.Adapter;

public class Adaptee {

    public void specificRequest(String id) {
        System.out.println("Adaptee.specificRequest[ id = " + id + "]");
    }

}
