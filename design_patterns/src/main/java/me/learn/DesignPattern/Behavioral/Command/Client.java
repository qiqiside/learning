package me.learn.DesignPattern.Behavioral.Command;

import me.learn.DesignPattern.utils.Util;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        int loopCount = 5;
        int commandCount = 60;

        List<Command> commandList = new ArrayList<Command>(commandCount);

        for (int i = 0 ; i < loopCount ; i ++) {
            for (int j = 0 ; j < commandCount ; j ++) {
                char key = (char) ('A' + Math.floor(26. * Math.random()));
                commandList.add(new ConcreteCommand(receiver, key));
            }

            for (int j = 0 ; j < commandCount ; j ++) {
                commandList.get(j).execute();
            }

            Util.show(receiver, "keyAfterExecute = {" + receiver.getKeys() + "}");

            for (int j = commandCount - 1 ; j >= 0 ; j --) {
                commandList.get(j).unexecute();
            }

            Util.show(receiver, "keysAfterUnexecute = {" + receiver.getKeys() + "}");

            commandList.clear();
            receiver.clearKeys();
        }

    }

}
