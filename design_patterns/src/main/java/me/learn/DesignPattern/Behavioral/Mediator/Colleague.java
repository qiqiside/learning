package me.learn.DesignPattern.Behavioral.Mediator;

public abstract class Colleague {

    private Mediator mediator;
    private String id;

    public Colleague(Mediator mediator, String id) {
        this.mediator = mediator;
        this.id = id;

        this.mediator.add(this);
    }

    public String getId() {
        return this.id;
    }

    public void send(String colleagueId, Object o) {
        this.mediator.send(colleagueId, o);
    }

    public abstract void recv(Object o);


}
