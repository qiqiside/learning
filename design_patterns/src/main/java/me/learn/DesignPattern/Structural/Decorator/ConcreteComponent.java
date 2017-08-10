package me.learn.DesignPattern.Structural.Decorator;

import me.learn.DesignPattern.utils.Util;

public class ConcreteComponent implements Component {

    public void operation() {
        Util.show(this, "operation");
    }

}
