package me.learn.DesignPattern.Behavioral.TemplateMethod;

import me.learn.DesignPattern.utils.Util;

public class ConcreteClass extends AbstractClass {

    public void primitiveOperation1() {
        Util.show(this, "primitiveOperation1");
    }

    public void primitiveOperation2() {
        Util.show(this, "primitiveOperation2");
    }

}
