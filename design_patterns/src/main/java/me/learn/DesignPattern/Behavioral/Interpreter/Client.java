package me.learn.DesignPattern.Behavioral.Interpreter;

import me.learn.DesignPattern.utils.Util;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        VariableExp x = new VariableExp("x");
        VariableExp y = new VariableExp("y");

        AndExp andExp = new AndExp(x, y);

        for (int i = 0 ; i < 4 ; i ++) {
            context.assign(x, (i & 1) == 1);
            context.assign(y, i > 2);

            Util.show(andExp, "and", andExp.evaluate(context));
        }
    }

}
