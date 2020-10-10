package oop.lab2.two;

import oop.lab2.two.FamilyMember;

public class Son extends FamilyMember {
    private boolean wellStudy;

    public Son(String name, int age, boolean wellStudy) {
        super(name, age);
        this.wellStudy = wellStudy;
    }

    public Son(String name, int age) {
        this(name, age, true); 
    }

    public Son() {
        this("", 0, true);
    }

    public boolean isGoodBoy() {
        return wellStudy;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        for (int i = 0; i < name.length(); i++) {
            result += (int) (name.charAt(i)) * 31 ^ (name.length() - i);
        }

        result = prime * result + ((wellStudy) ? 1 : 0);

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
        Son f = (Son) o;
        // field comparison
        return hashCode() == f.hashCode();
    }

    @Override
    public String toString() {
        return "Name [" + name + "]\n"
                + "Age [" + age + "]\n"
                + "Is good boy [" + ((wellStudy) ? "yes" : "no") + "]\n";
    }
}