package me.learn.DesignPattern.Structural.Composite;

public class Client {

    public static void main(String[] args) {
        Component subTree = new Composite();
        subTree.add(new Leaf());
        subTree.add(new Leaf());
        subTree.add(new Leaf());

        Component tree = new Composite();
        tree.add(new Leaf());
        tree.add(new Leaf());
        tree.add(subTree);
        tree.add(new Leaf());

        tree.operation();
        System.out.println();

        int index = 1;
        System.out.println("tree.get(" + index + ") = " + tree.getChild(index).toString());
        System.out.println();

        tree.remove(tree.getChild(2));
        tree.operation();
    }

}
