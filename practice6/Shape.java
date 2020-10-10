package practice6;

import practice6.Color;

public abstract class Shape {
    public Color color;
    public int pos;

    public Shape() {
        this(Color.BLACK, 0);
    }

    public Shape(Color color, int pos) {
        this.color = color;
        this.pos = pos;
    }

    public abstract void draw();
}