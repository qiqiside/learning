package me.learn.DesignPattern.Structural.Adapter;

import me.learn.DesignPattern.utils.Util;

public class Client {

    public static void main(String[] args) {
        Integer id = 100;

        Target target = new ClassAdapter();
        target.request(id);
        Util.show(target);

        target = new ObjectAdapter();
        target.request(id);
        Util.show(target);
    }

}
