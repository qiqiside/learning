package me.learn.DesignPattern.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Colleague> colleagueList;

    public ConcreteMediator() {
        this.colleagueList = new ArrayList<Colleague>();
    }

    public void add(Colleague colleague) {
        this.colleagueList.add(colleague);
    }

    public void send(String colleagueId, Object o) {
        for (Colleague colleague : colleagueList) {
            if (! colleague.getId().equals(colleagueId))
                continue;

            colleague.recv(o);
        }
    }

}
