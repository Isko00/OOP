package oop.lab1.problemFive;

import oop.lab1.problemFive.*;
import java.util.Vector;
import java.util.Scanner;

public class DragonLaunch {
    private Vector<Person > kidnapped;

    public DragonLaunch() {
        kidnapped = new Vector<Person >();
    }

    public void kidnap(Person p) {
        if (!kidnapped.isEmpty()
                && kidnapped.lastElement().isMagician(p)) {
            kidnapped.removeElementAt(kidnapped.size() - 1);
        } else {
            kidnapped.add(p);
        }
    }

    public boolean willDragoEatOrNot() {
        return kidnapped.size() > 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DragonLaunch myDragon = new DragonLaunch();
        String launch = in.nextLine();

        for (String s : launch.split("")) {
            try {
                Person p = new Person(s);
                myDragon.kidnap(p);
            } catch(WrongGenderExeption e) {
                System.out.print("Exception: "+ e.toString());
                System.out.println(" at [" + s + "].");
            }
        }

        if (myDragon.willDragoEatOrNot()) {
            System.out.println("Yeah, he has launch!");
        } else {
            System.out.println("Some diet for today ~_~");
        }
    }
}