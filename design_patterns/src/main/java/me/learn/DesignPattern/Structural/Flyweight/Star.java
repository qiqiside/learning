package me.learn.DesignPattern.Structural.Flyweight;

public class Star implements Body {

    public void draw(Canvas canvas, double x, double y, double size) {
        canvas.line(x - size / 2, y, x + size / 2, y);
        canvas.line(x, y - size / 2, x, y + size / 2);
    }

}
