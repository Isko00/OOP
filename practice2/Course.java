package oop.practice2;

public class Course {
    private final String name, description;
    private final String[] prerequisites;
    private int numberOfCredits;

    public Course() {
        name = "";
        description = "";
        prerequisites = null;
        numberOfCredits = 0;
    }

    public Course(String name, String description, 
            String[] prerequisites, int numberOfCredits) {
        this.name = name;
        this.description = description;
        this.prerequisites = prerequisites;
        this.numberOfCredits = numberOfCredits;
    }

    public String toString() {
        String allPrerequsites = "";

        for (String p : prerequisites) { 
            allPrerequsites += p + "| "; 
        }

        return "Name: " + name
                + "\nDescription: " + description
                + "\nPrerequisites:\n" + allPrerequsites
                + "\nNumberOfCredits: " + numberOfCredits;
    }
}