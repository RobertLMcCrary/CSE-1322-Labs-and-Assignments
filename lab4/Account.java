/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 2
*/



public class Account {
    protected static int nextAccountNumber = 1000;
    protected int accountNumber;
    protected double balance;

    // Default constructor
    public Account() {
        this.accountNumber = nextAccountNumber++;
        this.balance = 0.0;
    }

    // Overloaded constructor
    public Account(double initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return balance;
    }

    public void setAccountBalance(double balance) {
        this.balance = balance;
    }

    public void Withdrawal(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Withdrawal cancelled.");
        }
    }

    public void Deposit(double amount) {
        this.balance += amount;
    }
}
