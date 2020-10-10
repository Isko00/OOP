package oop.lab2.two;

import oop.lab2.two.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<FamilyMember> h = new HashSet<FamilyMember>();

        h.add(new Father("John", 53));
        h.add(new Father("John", 53));
        h.add(new Father("Jhon", 53, "He"));
        h.add(new Father("John", 54, "He"));
        h.add(new Father("John", 53, "Hr"));

        h.add(new Son("John", 13));
        h.add(new Son("John", 13));
        h.add(new Son("Join", 13));
        h.add(new Son("John", 14));
        h.add(new Son("John", 13, true));
        h.add(new Son("John", 13, false));

        for (FamilyMember f : h) {
            System.out.println(f);
        }

        /*Father q = new Father("John", 53, "He");
        Father w = new Father("Jhon", 53, "He");
        Father e = new Father("John", 54, "He");
        Father r = new Father("John", 53, "Hr");
        Father t = new Father("John", 53);
        System.out.println(q.hashCode());
        System.out.println(w.hashCode());
        System.out.println(e.hashCode());
        System.out.println(r.hashCode());
        System.out.println(t.hashCode());*/
    }
}