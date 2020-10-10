package oop.lab2.two;

import oop.lab2.two.FamilyMember;

public class Father extends FamilyMember {
    String fightStory;

    public Father(String name, int age, String fightStory) {
        super(name, age);
        this.fightStory = fightStory;
    }

    public Father(String name, int age) {
        this(name, age, ""); 
    }

    public Father() {
        this("", 0, "");
    }

    public boolean hasFightStory() {
        return fightStory.length() == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        for (int i = 0; i < name.length(); i++) {
            result += (int) (name.charAt(i)) * 31 ^ (name.length() - i);
        }

        for (int i = 0; i < fightStory.length(); i++) {
            result += (int) (fightStory.charAt(i)) * 31 ^ (fightStory.length() - i);
        }

        result = prime * result + age;

        return result;
    }

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        /*if (getClass() != o.getClass())
            return false;*/
        Father f = (Father) o;
        // field comparison
        return hashCode() == f.hashCode();
    }

    @Override
    public String toString() {
        return "Name [" + name + "]\n"
                + "Age [" + age + "]\n"
                + "Fight story [" + fightStory + "]\n";
    }
}