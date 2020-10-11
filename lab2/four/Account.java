package oop.lab2.four;

public class Account {
    private double balance; // The current balance
    private int accNumber;  // The account number

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public Account() {
        this(0);
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        balance -= sum;
    }

    public double getBalance () { return balance; }

    public double getAccountNumber() {
        return (double) (accNumber);
    }

    public void transfer(double amount, Account other) {
        deposit(amount);
        other.withdraw(amount);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + accNumber;

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
        Account f = (Account) o;
        // field comparison
        return hashCode() == f.hashCode();
    }

    @Override
    public String toString() {
        return "Account number[" + accNumber + "]\n"
                + "Balance [" + String.format("%.2f", 
                    balance) + "]\n";

    }

    public final void print() {
        // Do not override this, override the toString method
        System.out.println ( toString() );
    }
}