package oop.lab2.five;

import oop.lab2.five.*;

class EmptySeriesException extends Exception {
    public String toString() {
        return "Series has to get two resistors!";
    }
}

public class Series extends Resistor {
    Circuit arr[] = new Circuit[2];

    public Series(Circuit q, Circuit w) {
        super(q.getResistance() + w.getResistance());
        arr[0] = q;
        arr[1] = w;
    }

    public Series(Resistor q, Resistor w) {
        this((Circuit) q, (Circuit) w);
    }

    public Series(Resistor q) throws EmptySeriesException {
        throw new EmptySeriesException();
    }

    public Series(Circuit q) throws EmptySeriesException {
        throw new EmptySeriesException();
    }

    public Series() throws EmptySeriesException {
        throw new EmptySeriesException();
    }

    @Override
    public void applyPotentialDiff(double V) {
        for (Circuit c : arr) {
            Resistor r = (Resistor) c;
            r.applyPotentialDiff(r.getResistance() / super.getResistance() 
                    * V);
        }
    }
}