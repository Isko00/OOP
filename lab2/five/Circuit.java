package oop.lab2.five;

public abstract class Circuit {
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double V);

    public double getPower() {
        return getPotentialDiff() * getCurrent();
    }

    public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }
}