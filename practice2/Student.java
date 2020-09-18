package oop.practice2;

public class Student {
    private final String name;
    private final int id;
    private int mark, yearOfStudy = 0;

    public Student() {
        name = "";
        id = 0;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }

    public int getId() { return id; }

    public int getMark() { return mark; }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void incrementYearOfStudy() { yearOfStudy++; }

    public String toString() {
        return "Name: " + name
                + ", ID: " + id;
    }
}