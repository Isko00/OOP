package oop.lab1.problemOne;

import oop.practice2.Student;

public class Data {
    private double sum, max;
    private Student maxS, minS;
    private int length;

    public Data() {
        this.sum = 0.0;
        this.max = 0.0;
        this.length = 0;
    }

    public void add(int number) {
        sum += (double)number;
        length++;
        if (max < (double)number) { max = (double)number; }
    }

    public void add(Student s) {
        sum += (double)s.getMark();
        length++;
        if (maxS == null && minS == null) { maxS = s; minS = s; }
        else if (maxS.getMark() < s.getMark()) { maxS = s; }
        else if (minS.getMark() > s.getMark()) { minS = s; }
    }

    public double getAverage() { return sum / length; }

    public double getLargest() { return max; }
    
    public Student getMaxStudent() { return maxS; }

    public Student getMinStudent() { return minS; }
}