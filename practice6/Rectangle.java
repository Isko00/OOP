package practice6;

import practice6.Color;
import practice6.Shape;

public class Rectangle extends Shape{
    private int width;

    public Rectangle(Color color, int pos, int width) {
        super(color, pos);
        this.width = width;
    }

    public Rectangle(Color color, int pos) {
        this(color, pos, 0);
    }

    public Rectangle() {
        super();
        this.width = 0;
    }

    public String toString() {
        return "[" + " ".repeat(width) + "]";
    }

    @Override
    public void draw() {
        System.out.print(" ".repeat(pos));
        if (color == Color.RED) {
            System.err.println(this);
        } else {
            System.out.println(this);
        }
    }

    public int getWidth() {
        return width;
    }
}