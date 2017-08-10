package me.learn.DesignPattern.Behavioral.State;

import me.learn.DesignPattern.utils.Util;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        Util.show(context.getState());
        for (int i = 0 ; i < 5 ; i ++) {
            context.handle();
            Util.show(context.getState());
        }
    }

}
