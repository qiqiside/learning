package me.learn.DesignPattern.Behavioral.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<VariableExp, Boolean> map;

    public Context() {
        map = new HashMap<VariableExp, Boolean>();
    }

    public boolean lookup(String name) {
        for (VariableExp variableExp : map.keySet()) {
            String variableName = variableExp.getName();

            if (variableName != null && variableName.equals(name))
                return map.get(variableExp);
        }

        return false;
    }

    public void assign(VariableExp exp, boolean value) {
        map.put(exp, value);
    }

}
