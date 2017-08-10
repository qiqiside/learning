package me.learn.DesignPattern.Behavioral.Interpreter;

public class VariableExp implements BooleanExp {

    private String name;

    public VariableExp(String name) {
        this.name = String.valueOf(name);
    }

    public boolean evaluate(Context context) {
        return context.lookup(name);
    }

    public BooleanExp replace(String name, BooleanExp booleanExp) {
        if (name.equals(this.name))
            return booleanExp.copy();

        return copy();
    }

    public BooleanExp copy() {
        return new VariableExp(name);
    }

    public String getName() {
        return name;
    }

}
