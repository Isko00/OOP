package oop.lab1.problemFive;

class WrongGenderExeption extends Exception {
    public String toString() {
        return "Your gender must be only 'G' or 'B'!";
    }
}