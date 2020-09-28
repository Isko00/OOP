package oop.homeWork.problem1;

public class Animal {
    private final String name, nameInLatin;
    private String description;

    public Animal(String name, String nameInLatin, String description) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.description = description;
    }

    public Animal() {
        this("", "", "");
    }

    public Animal(String name) {
        this(name, "", "");
    }

    public String makeSound() {
        return "";
    }

    public String getName() {
        return name;
    }

    public String getName(String languange) {
        return (languange.equalsIgnoreCase("latin")) ? nameInLatin : "";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public void addDescription(String partOfDescription) {
        description += ",\n" + partOfDescription;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\nName in latin: " + nameInLatin
                + "\nDescription: " + description;
    }
}