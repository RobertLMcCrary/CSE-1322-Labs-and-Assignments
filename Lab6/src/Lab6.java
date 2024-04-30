/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 6
 */

/*
F(n) = F (n – 1) + F(n – 2).
The sequence looks like:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
Hence Fibonacci(10) is 55. Fibonacci(6) = 8 etc.
 */

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter the number you want to find the Fibonacci Series for:");
        number = input.nextInt();

        FindFib fibIteration = new FibIteration();
        FindFib fibFormula = new FibFormula();

        System.out.println("Fib of " + number + " by iteration is: " + fibIteration.calculate_fib(number));
        System.out.println("Fib of " + number + " by iteration is: " + fibFormula.calculate_fib(number));
    }
}
