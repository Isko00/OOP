package oop.homeWork.problem2;

import oop.homeWork.problem2.Person;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff (String name, String address, 
            String school, Double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public Staff() {
        super();
        school = "";
        pay = 0;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return "Staff[" + super.toString()
            + ", school = " + school
            + ", pay = " + pay + "]";
    }
}