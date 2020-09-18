package oop.lab1.problemFive;

import oop.lab1.problemFive.*;

public class Person {
    private Gender myGender;

    public Person(Gender gender) { myGender = gender; }

    public Person(String genderSign) throws WrongGenderExeption { 
        myGender = (genderSign.equals("G")) ? Gender.G
            : (genderSign.equals("B")) ? Gender.B : null;
        if (myGender == null) {
            throw new WrongGenderExeption(); 
        }
    }

    public Person(char genderSign) throws WrongGenderExeption { 
        myGender = (genderSign == 'G') ? Gender.G
            : (genderSign == 'B') ? Gender.B : null;
        if (myGender == null) {
            throw new WrongGenderExeption(); 
        }
    }

    public Gender getGender() { return myGender; }

    public boolean isMagician(Person p) {
        return (myGender == Gender.B 
                && p.getGender() == Gender.G);
    }

    public String toString() {
        return "Gender: " + myGender.toString();
    }
}