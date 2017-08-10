package me.learn.DesignPattern.Structural.Composite;

import me.learn.DesignPattern.utils.Util;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> childList;

    public Composite() {
        childList = new ArrayList<Component>();
    }

    public void operation() {
        for (Component c : childList) {
            c.operation();
        }

        Util.show(this);
    }

    public void add(Component component) {
        childList.add(component);
    }

    public void remove(Component component) {
        if (childList.contains(component)) {
            childList.remove(component);
        }
    }

    public Component getChild(int index) {
        if (index >= childList.size())
            return null;

        return childList.get(index);
    }

}
