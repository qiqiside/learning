package me.learn.DesignPattern.Behavioral.Strategy;

public class Context {

    private Strategy strategy;

    public Context(String algorithmName) {
        try {
            if (algorithmName.equals("ConcreteStrategy1")) {
                strategy = new ConcreteStrategy1();
            } else if (algorithmName.equals("ConcreteStrategy2")) {
                strategy = new ConcreteStrategy2();
            } else if (algorithmName.equals("ConcreteStrategy3")) {
                strategy = new ConcreteStrategy3();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contextInterface() {
        if (strategy == null)
            return;

        strategy.algorithmInterface();
    }

}
