package oop.lab2.two;

public abstract class FamilyMember {
    String name;
    int age;

    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public FamilyMember() {
        this("", 0);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        for (int i = 0; i < name.length(); i++) {
            result += (int) (name.charAt(i)) * 31 ^ (name.length() - i);
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
        FamilyMember f = (FamilyMember) o;
        // field comparison
        return hashCode() == f.hashCode();
    }

    @Override
    public String toString() {
        return "Name [" + name + "]\n"
                + "Age [" + age + "]";
    }
}