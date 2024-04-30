/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 2
*/

import java.util.Scanner;

public class Lab4 {
    public static void printMenu() {
        System.out.println("""
                1. Withdraw from Checking
                2. Withdraw from Savings
                3. Deposit to Checking
                4. Deposit to Savings
                5. Balance of Checking
                6. Balance of Savings
                7. Award Interest to Savings now
                8. Quit
                """);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account = new Account();
        Checking checking = new Checking(1000);
        Savings savings = new Savings(1000);

        int choice;

        do {

            printMenu();
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    double withdrawalCheckingAmount = input.nextDouble();
                    checking.Withdrawal(withdrawalCheckingAmount);
                    break;

                case 2:
                    //withdraw savings
                    System.out.println("How much would you like to withdraw from Savings?");
                    double withdrawSavingsAmount = input.nextDouble();
                    savings.Withdrawal(withdrawSavingsAmount);
                    break;

                case 3:
                    //deposit checking
                    break;

                case 4:
                    //deposit saving
                    break;

                case 5:
                    //display balance of checking
                    break;

                case 6:
                    //display balance of savings
                    break;

                case 7:
                    //award interest to savings
                    break;
            }

        } while (choice != 8);

        input.close();
    }
}
