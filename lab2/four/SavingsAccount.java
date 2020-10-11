package oop.lab2.four;

import oop.lab2.four.Account;

public class SavingsAccount extends Account {
    private double interestRate; // The persent additional to balance per year

    public SavingsAccount(int a, double interestRate) {
        super(a);
        this.interestRate = interestRate;
    }

    public SavingsAccount(int a) {
        this(a, 0.0);
    }

    public SavingsAccount() {
        this(0, 0.0);
    }

    public void addInterestToTheAccount() {
        deposit(getBalance() * interestRate);
    }

    @Override
    public String toString() {
        return super.toString() + "Interest rate [" + String.format("%.2f", 
                    interestRate) + "]\n";

    }
}