package oop.lab2.five;

import oop.lab2.five.*;

public class Main {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);
        Circuit f = new Series(a, b);
        Circuit g = new Parralel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parralel(h, f);
        double R = circuit.getResistance();
        System.out.println("Rth = " + String.format("%.2f", 
                    R) + "(Ohm)");

        circuit.applyPotentialDiff(10.0);
        System.out.println("Look at resistor A:");
        System.out.println("I = " + String.format("%.2f", 
                    a.getCurrent()) + "(A)");
        System.out.println("V = " + String.format("%.2f", 
                    a.getPotentialDiff()) + "(V)");
        System.out.println("R = " + String.format("%.2f", 
                    a.getResistance()) + "(Ohm)");
        System.out.println("P = " + String.format("%.2f", 
                    a.getPower()) + "(W)");
    }
}