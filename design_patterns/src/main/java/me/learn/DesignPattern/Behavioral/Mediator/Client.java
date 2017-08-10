package me.learn.DesignPattern.Behavioral.Mediator;

import me.learn.DesignPattern.utils.Util;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        String id1 = "AAA";
        String id2 = "BBB";

        Colleague colleague1 = new ConcreteColleague1(mediator, id1);
        Colleague colleague2 = new ConcreteColleague2(mediator, id2);

        Util.show(colleague1, "send a random integer to ", colleague2);
        colleague1.send(id2, Math.random());
        System.out.println();

        Util.show(colleague2, "send a random integer to ", colleague1);
        colleague2.send(id1, Math.random());
    }

}
