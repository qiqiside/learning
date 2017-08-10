package me.learn.DesignPattern.Behavioral.Mediator;

import me.learn.DesignPattern.utils.Util;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator, String id) {
        super(mediator, id);
    }

    public void recv(Object o) {
        Util.show(this, "recv", o);
    }

}
