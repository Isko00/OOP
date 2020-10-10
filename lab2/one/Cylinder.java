package oop.lab2.one;

import oop.lab2.one.Shape;

public class Cylinder extends Shape {
    private int radius, height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public Cylinder() {
        this(1, 1);
    }

    @Override
    public String getName() {
        return "Cylinder";
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    };

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height); 
    };

    @Override
    public String toString() {
        return "Radius [" + radius + "]\n"
                + "Height [" + height + "]\n"
                + "Volume [" + String.format("%.2f", 
                    volume()) + "]\n"
                + "Surface area [" + String.format("%.2f", 
                    surfaceArea()) + "]\n";
    }
}