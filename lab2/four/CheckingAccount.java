package oop.lab2.four;

import oop.lab2.four.Account;

public class CheckingAccount extends Account {
    private int counter = 0; // Number of transactions done by user
    private int freeTransactions; // Number of free transactions
    private double fee; // Cost of transaction - withdraw or deposit

    public CheckingAccount(int a, double fee, int freeTransactions) {
        super(a);
        this.fee = fee;
        this.freeTransactions = freeTransactions;
    }

    public CheckingAccount(int a, double fee) {
        this(a, fee, 0);
    }

    public CheckingAccount(int a) {
        this(a, 0.0, 0);
    }

    public CheckingAccount() {
        this(0, 0.0, 0);
    }

    public void deductFee() {
        withdraw(fee);
    }

    public int getNumberOfTransactionsDone() {
        return counter;
    }

    public int getNumberOfFreeTransactions() {
        return freeTransactions;
    }

    public void takeFee() {
        if (freeTransactions > 0) {
            freeTransactions --;
        } else {
            super.withdraw(fee);
        }
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        takeFee();
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        takeFee();
    }

    @Override
    public void transfer(double amount, Account other) {
        deposit(amount);
        other.withdraw(amount);
    }

    @Override
    public String toString() {
        return super.toString() 
                + "Number of transactions done by user [" + counter + "]\n"
                + "Number of free transactions [" + freeTransactions + "]\n"
                + "Fee [" + String.format("%.2f", fee) + "]\n";
    }
}