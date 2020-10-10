package practice6;

import practice6.Color;
import practice6.Shape;

public class Circle extends Shape {
    public Circle(Color color, int pos) {
        super(color, pos);
    }

    public Circle() {
        super();
    }

    public String toString() {
        return "o";
    }

    @Override
    public void draw() {
        if (color == Color.RED) {
            System.err.println(this);
        } else {
            System.out.println(this);
        }
    }

    public void draw(int amount) {
        System.out.print(" ".repeat(pos));
        for (int i = 0; i < amount; i++) {
            if (color == Color.RED) {
                System.err.print(this + " ");
            } else {
                System.out.print(this + " ");
            }
        }
        System.out.println("");
    }

}