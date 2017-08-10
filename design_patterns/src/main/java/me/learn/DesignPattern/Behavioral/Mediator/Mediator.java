package me.learn.DesignPattern.Behavioral.Mediator;

public interface Mediator {

    void add(Colleague colleague);
    void send(String colleagueId, Object o);

}
