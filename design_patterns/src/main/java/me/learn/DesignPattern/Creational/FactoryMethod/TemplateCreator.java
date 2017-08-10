package me.learn.DesignPattern.Creational.FactoryMethod;

public class TemplateCreator {

    public <T extends Product> Product FactoryMethod(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}
