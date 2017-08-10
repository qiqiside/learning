package me.learn.DesignPattern.Behavioral.Interpreter;

// BooleanExp ::= VariableExp | Constant | OrExp | AndExp | NotExp | '(' BooleanExp ')'
// AndExp ::= BooleanExp 'and' BooleanExp
// OrExp ::= BooleanExp 'or' BooleanExp
// NotExp ::= 'not' BooleanExp
// Constant ::= 'true' | 'false'
// VariableExp ::= 'A' | 'B' | ... | 'X' | 'Y' | 'Z'

public interface BooleanExp {

    boolean evaluate(Context context);
    BooleanExp replace(String str, BooleanExp booleanExp);
    BooleanExp copy();

}
