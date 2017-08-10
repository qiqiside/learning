package me.learn.DesignPattern.Structural.Flyweight;

public class Client {

    private static double WIDTH = 800D;
    private static double HEIGHT = 600D;

    private static double getX() {
        return WIDTH * Math.random();
    }

    private static double getY() {
        return HEIGHT * Math.random();
    }

    private static double getMoonSize() {
        return WIDTH / 4 * Math.random();
    }

    private static double getStarSize() {
        return WIDTH / 16 * Math.random();
    }

    public static void main(String[] args) {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);

        BodyFactory bodyFactory = new BodyFactory();
        Body moon = bodyFactory.getBody(BodyFactory.TYPE_MOON);
        moon.draw(canvas, getX(), getY(), getMoonSize());

        for (int i = 0 ; i < 100 ; i ++) {
            Body star = bodyFactory.getBody(BodyFactory.TYPE_STAR);
            star.draw(canvas, getX(), getY(), getStarSize());
        }

    }

}
