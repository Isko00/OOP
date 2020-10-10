package oop.lab2.one;

import oop.lab2.one.Shape;

public class Cube extends Shape {
    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public Cube() {
        this(1);
    }

    @Override
    public String getName() {
        return "Cube";
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    };

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2); 
    };

    public double diagonal() {
        return Math.sqrt(2 * Math.pow(side, 2));
    }

    @Override
    public String toString() {
        return "Side [" + side + "]\n"
                + "Volume [" + String.format("%.2f", 
                    volume()) + "]\n"
                + "Surface area [" + String.format("%.2f", 
                    surfaceArea()) + "]\n";
    }
}