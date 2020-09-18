package oop.lab1;

import java.util.Random;
import java.util.Scanner;
import oop.practice2.*;
import oop.lab1.problemOne.Data;

public class GradeBook {
    Random random = new Random();
    Scanner in = new Scanner(System.in);
    Data myData = new Data();
    String[] prerequisites = {"Math", "Phys"};
    private final Course course = new Course("CS101",
            "Object-oriented programming and design",
            prerequisites, 3);
    private Student[] listOfStudents = new Student[10];
    private int[] gradesDistribution = new int[11];

    {
        for (char i = 'A'; i < 'K'; i++) {
            int id = random.nextInt(100);
            Student s = new Student("" + i, id);
            listOfStudents[i - 'A'] = s;
        }
    }

    public GradeBook() {
        System.out.println("\nPlease, input grades for students:\n");
        for (Student s : listOfStudents) {
            System.out.print("Student " + s.getName() + ": ");
            s.setMark(in.nextInt());
            myData.add(s);
            gradesDistribution[s.getMark() / 10]++;
        }
    }

    public static void displayMessage() {
        System.out.print("Welcome to the grade book for ");
        System.out.println("CS101 Object-oriented programming and Design!");
    }

    public void displayGradeReport() {
        Student min = myData.getMinStudent();
        Student max = myData.getMaxStudent();

        System.out.println("Class average is " + myData.getAverage() + ". ");
        System.out.println("Lowest grade is " + 
                min.getMark() + " (" + min + "). ");
        System.out.println("Highest grade is " +
                max.getMark() + " (" + max + "). ");
    }

    public void displayGradesDistribution() {
        for (int i = 0; i < gradesDistribution.length - 1; i++) {
            System.out.print(i + "0-" + i + "9: ");
            
            for (int j = 0; j < gradesDistribution[i]; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        System.out.print("100: ");
        for (int j = 0; j 
                < gradesDistribution[gradesDistribution.length - 1]; j++) {
            System.out.print("*");
        }
    }

    public String toString() {
        String allStudents = "";

        for (Student s : listOfStudents) { allStudents += s + "\n"; }

        return "Course: " + course
                + "\nStudents: " + allStudents;
    }

    public static void main(String[] args) {
        displayMessage();
        GradeBook myBook = new GradeBook();
        System.out.println();
        myBook.displayGradeReport();
        System.out.println("\nGrades distribution:");
        myBook.displayGradesDistribution();
        //System.out.println(myBook);
    }
}