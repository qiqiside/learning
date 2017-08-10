package me.learn.DesignPattern.Structural.Proxy;

import me.learn.DesignPattern.utils.Util;

public class RealSubject implements Subject {

    public void request() {
        Util.show(this, "realSubject.request");
    }

}
