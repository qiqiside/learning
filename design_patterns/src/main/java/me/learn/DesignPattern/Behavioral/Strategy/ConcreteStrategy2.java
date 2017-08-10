package me.learn.DesignPattern.Behavioral.Strategy;

import me.learn.DesignPattern.utils.Util;

public class ConcreteStrategy2 implements Strategy {

    public void algorithmInterface() {
        Util.show(this, "algorithmInterface");
    }

}