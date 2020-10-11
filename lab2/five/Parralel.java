package oop.lab2.five;

import oop.lab2.five.*;

class EmptyParralelException extends Exception {
    public String toString() {
        return "Parralel has to get two resistors!";
    }
}

public class Parralel extends Resistor {
    public Circuit arr[] = new Circuit[2];

    public Parralel(Circuit q, Circuit w) {
        super(1 / (1 / q.getResistance() + 1 / w.getResistance()));
        arr[0] = q;
        arr[1] = w;
    }

    public Parralel(Resistor q, Resistor w) {
        this((Circuit) q, (Circuit) w);
    }

    public Parralel(Resistor q) throws EmptyParralelException {
        throw new EmptyParralelException();
    }

    public Parralel(Circuit q) throws EmptyParralelException {
        throw new EmptyParralelException();
    }

    public Parralel() throws EmptyParralelException {
        throw new EmptyParralelException();
    }

    @Override
    public void applyPotentialDiff(double V) {
        for (Circuit c : arr) {
            Resistor r = (Resistor) c;
            r.applyPotentialDiff(V);
        }
    }
}