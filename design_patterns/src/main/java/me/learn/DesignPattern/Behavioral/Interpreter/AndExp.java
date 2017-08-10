package me.learn.DesignPattern.Behavioral.Interpreter;

public class AndExp implements BooleanExp {

    private BooleanExp operand1;
    private BooleanExp operand2;

    public AndExp(BooleanExp operand1, BooleanExp operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public boolean evaluate(Context context) {
        return operand1.evaluate(context) && operand2.evaluate(context);
    }

    public BooleanExp replace(String name, BooleanExp booleanExp) {
        return new AndExp(operand1.replace(name, booleanExp), operand2.replace(name, booleanExp));
    }

    public BooleanExp copy() {
        return new AndExp(operand1.copy(), operand2.copy());
    }

}
