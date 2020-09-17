import java.util.Scanner;

public class BankAccount {
    static int getBalanceAfterYear(int balance, int percent) {
        return balance + (balance / 100 * percent);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter balance: ");
        int balance = in.nextInt();
        System.out.print("Enter percent: ");
        int percent = in.nextInt();

        balance = getBalanceAfterYear(balance, percent);

        System.out.println("New balance = " + balance);
    }
}