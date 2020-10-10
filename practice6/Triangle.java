package practice6;

import practice6.Color;
import practice6.Shape;

public class Triangle extends Shape{
    public Triangle(Color color, int pos) {
        super(color, pos);
    }

    public Triangle() {
        super();
    }

    public String toString() {
        return "/_\\";
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
}