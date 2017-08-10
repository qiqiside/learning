package me.learn.DesignPattern.Structural.Composite;

import me.learn.DesignPattern.utils.Util;

public class Leaf extends Component {

    public void operation() {
        Util.show(this);
    }

}
