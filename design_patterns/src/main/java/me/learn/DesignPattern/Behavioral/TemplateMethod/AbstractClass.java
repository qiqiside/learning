package me.learn.DesignPattern.Behavioral.TemplateMethod;

import me.learn.DesignPattern.utils.Util;

public abstract class AbstractClass {

    public void templateMethod() {
        Util.show(this, "templateMethod");
        primitiveOperation1();
        primitiveOperation2();
    }

    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

}
