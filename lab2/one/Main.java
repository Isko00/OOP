package oop.lab2.one;

import oop.lab2.one.*;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Shape> v = new Vector<Shape>();

        v.add(new Cylinder());
        v.add(new Sphere());
        v.add(new Cube());

        for (Shape s : v) {
            System.out.println("\n" + s.getName() + ":");
            System.out.print(s);
            if (s instanceof Cube) {
                Cube c = (Cube)(s);
                System.out.println("Diagonal [" + String.format("%.2f", 
                    c.diagonal()) + "]");
            }
        }
    }
}