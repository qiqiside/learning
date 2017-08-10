package me.learn.DesignPattern.Structural.Flyweight;

public class Moon implements Body {

    public void draw(Canvas canvas, double x, double y, double size) {
        canvas.circle(x, y, size / 2);
    }

}
