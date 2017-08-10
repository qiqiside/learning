package me.learn.DesignPattern.Structural.Proxy;

import me.learn.DesignPattern.utils.Util;

public class Proxy implements Subject {

    private Subject realSubject;

    public Proxy() {
        realSubject = new RealSubject();
    }

    public void request() {
        Util.show(this, "transfer to realSubject.request");
        realSubject.request();
    }

}
