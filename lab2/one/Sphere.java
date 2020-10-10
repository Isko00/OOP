package oop.lab2.one;

import oop.lab2.one.Shape;

public class Sphere extends Shape {
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public Sphere() {
        this(1);
    }

    @Override
    public String getName() {
        return "Sphere";
    }

    @Override
    public double volume() {
        return 2 * Math.PI * Math.pow(radius, 3);
    };

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2); 
    };

    @Override
    public String toString() {
        return "Radius [" + radius + "]\n"
                + "Height [" + radius + "]\n"
                + "Volume [" + String.format("%.2f", 
                    volume()) + "]\n"
                + "Surface area [" + String.format("%.2f", 
                    surfaceArea()) + "]\n";
    }
}