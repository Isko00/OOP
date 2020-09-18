package oop.lab1.problemFive;

public enum Gender {
	B("Boy"),
	G("Girl");

	private String name;

    Gender(String name) {
        this.name = name;
    }

    public String toString() { return name; }

    public char getSign() { return name.charAt(0); }
}