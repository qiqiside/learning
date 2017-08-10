package me.learn.DesignPattern.Structural.Facade;

import me.learn.DesignPattern.utils.Util;

public class Service {

    public void operationA() {
        Util.show(this, "operationA");
    }

    public void operationB() {
        Util.show(this, "operationB");
    }

    public void innerOperationC() {
        Util.show(this, "innerOperationC");
    }

}
