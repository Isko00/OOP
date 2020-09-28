package oop.homeWork.problem1;

import oop.homeWork.problem1.Animal;

public class Snake extends Animal {
    private String sound = "Pshh!";
    public Snake() {
        super("snake", "anguis", "Sign of intellect in some mythologies");
    }

    @Override
    public String makeSound() {
        System.out.println(sound);
        return sound;
    }

    @Override
    public String toString() {
        super.addDescription("Sound = " + sound);
        return super.toString();
    }

    public static void main(String[] args) {
        Snake mySnake = new Snake();
        mySnake.makeSound();
        System.out.println(mySnake);
    }
}