package oop.lab2.four;

import oop.lab2.four.*;
import java.util.Vector;

public class Bank {
    private static Vector<Account> v = new Vector<Account>();

    public static void fill() {
        v.add(new SavingsAccount(1, 0.15));
        v.add(new SavingsAccount(2, 0.1));
        v.add(new SavingsAccount(3));

        v.add(new CheckingAccount(4, 10, 2));

        v.add(new Account(5));
        v.add(new Account(6));
    }

    public static void openAccount(Account newAcc) {
        v.add(newAcc);
    }

    public static void closeAccount(Account acc) {
        v.remove(acc);
    }

    public static void update() {
        for (Account a : v) {
            a.deposit(123.4);
            a.withdraw(54.3);
            if (a instanceof SavingsAccount) {
                SavingsAccount s = (SavingsAccount) (a);
                s.addInterestToTheAccount();
            }
        }
    }

    public static void print() {
        for (Account a : v) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        fill();
        print();
        update();
        print();
    }
}