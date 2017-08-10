package me.learn.DesignPattern.Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Element> elementList;

    public ObjectStructure() {
        this.elementList = new ArrayList<Element>();
    }

    public void add(Element element) {
        elementList.add(element);
    }

    public void visit(Visitor visitor) {
        for (Element element : elementList) {
            element.accept(visitor);
        }
    }

}
