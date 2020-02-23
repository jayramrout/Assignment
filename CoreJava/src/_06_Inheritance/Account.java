package _06_Inheritance;

/**
 * A class for bank accounts.
 */

public class Account {
    private double bal;  //The current balance
    private int accnum;  //The account number


    public Account(int a) {
        bal = 0.0;
        accnum = a;
    }

    public void deposit(double sum) {
        if (sum > 0)
            bal += sum;
        else
            System.err.println("Account.deposit(...): "
                    + "cannot deposit negative amount.");
    }

    public void withdraw(double sum) {
        if (sum > 0)
            bal -= sum;
        else
            System.err.println("Account.withdraw(...): "
                    + "cannot withdraw negative amount.");
    }

    public double getBalance() {
        return bal;
    }

    public double getAccountNumber() {
        return accnum;
    }

    public String toString() {
        return "Acc " + accnum + ": " + "balance = " + bal;
    }

    public final void print() {
        //Don't override this,
        //override the toString method
        System.out.println(toString());
    }

}