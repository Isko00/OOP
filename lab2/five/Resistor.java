package oop.lab2.five;

import oop.lab2.five.Circuit;

public class Resistor extends Circuit {
    private final double R;
    private double potentialDifference;

    public Resistor(double resistance) {
        R = resistance;
    }

    public Resistor() {
        this(1.0);
    }

    @Override
    public double getResistance() {
        return R;
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        potentialDifference = V;
    }
}