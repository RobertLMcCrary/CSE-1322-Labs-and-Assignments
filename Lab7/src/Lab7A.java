/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 7
 */

import java.util.Scanner;

public class Lab7A {
    public static int recursive_multiply(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }

        return num1 + recursive_multiply(num1, num2 - 1);
    }

    public static int recursive_div(int num1, int num2) {
        if (num2 == 0) {
            return -1; // Error: division by zero
        } else if (num1 == num2) {
            return 1;
        } else if (num1 < num2) {
            return 0;
        }

        return 1 + recursive_div(num1 - num2, num2);
    }

    private static int recursive_mod(int num1, int num2) {
        if (num2 == 0) {
            return -1; // Error: division by zero
        } else if (num1 < num2) {
            return num1;
        }

        return recursive_mod(num1 - num2, num2);

    }

    private static void PrintMenu() {
        System.out.print("""
                Choose from the following:
                0. Quit
                1. Multiply 2 numbers
                2. Div 2 numbers
                3. Mod 2 numbers
                                
                """);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;

        do {

            PrintMenu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter first number");
                    int multiplyNum1 = input.nextInt();
                    System.out.println("Enter second number");
                    int multiplyNum2 = input.nextInt();

                    System.out.println("Answer: " + recursive_multiply(multiplyNum1, multiplyNum2));
                    break;

                case 2:
                    System.out.println("Enter first number");
                    int divNum1 = input.nextInt();
                    System.out.println("Enter second number");
                    int divNum2 = input.nextInt();

                    System.out.println("Answer: " + recursive_div(divNum1, divNum2));
                    break;

                case 3:
                    System.out.println("Enter first number");
                    int modNum1 = input.nextInt();
                    System.out.println("Enter second number");
                    int modNum2 = input.nextInt();

                    System.out.println("Answer: " + recursive_mod(modNum1, modNum2));
                    break;
            }

        } while (choice != 0);

        input.close();
    }
}
