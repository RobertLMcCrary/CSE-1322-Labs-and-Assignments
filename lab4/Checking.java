/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 2
*/

class Checking extends Account {

    public Checking(double initialBalance) {
        super(initialBalance);
    }

    //override withdrawal and deposit
    @Override
    public void Withdrawal(double amount) {
        if (amount > super.getAccountBalance() || amount - super.getAccountBalance() <= 0) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            super.setAccountBalance(super.getAccountBalance() - 20);
        }
        this.setAccountBalance(this.getAccountBalance() - amount);
    }

    @Override
    public void Deposit(double amount) {
        this.setAccountBalance(this.getAccountBalance() + amount);
    }
}
