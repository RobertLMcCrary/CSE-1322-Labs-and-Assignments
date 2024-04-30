/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 2
*/

class Savings extends Account {
    private int depositCount;
    private double interest;

    public Savings(double initialBalance) {
        super(initialBalance);
        this.depositCount = 0;
    }

    //override withdrawal
    @Override
    public void Withdrawal(double amount) {
        if (super.getAccountBalance() < 500) {
            System.out.println("Charging a fee of $10 because you are below $500");
            super.setAccountBalance(super.getAccountBalance() - 10);
        }

        this.setAccountBalance(this.getAccountBalance() - amount);
    }

    //deposit method
    @Override
    public void Deposit(double amount) {
        if (this.depositCount > 5) {
            System.out.println("“Charging a fee of $10");
            super.setAccountBalance(super.getAccountBalance() - 10);
        }

        this.setAccountBalance(this.getAccountBalance() + amount);
        System.out.println("This is deposit " + this.depositCount + " to this account.");
    }

    public void awardInterest() {
        interest = getAccountBalance() * 0.015;
        System.out.println("Customer earned " + interest + " in interest.");
        super.Deposit(interest);
    }
}
