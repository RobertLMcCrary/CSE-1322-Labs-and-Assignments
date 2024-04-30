/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 11
 */

import java.util.Scanner;

public class Lab11 {

    private static void PrintMenu() {
        System.out.println("0. Quit");
        System.out.println("1. Add BlueRay to collection");
        System.out.println("2. See collection");
    }

    public static void main(String[] args) {
        BlueRayCollection collection = new BlueRayCollection();

        Scanner input = new Scanner(System.in);
        int choice;

        do {

            PrintMenu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("What is the title?");
                    input.nextLine();
                    String title = input.nextLine();
                    System.out.println("What is the director?");
                    String director = input.nextLine();
                    System.out.println("What is the year of release?");
                    int year = input.nextInt();
                    System.out.println("What is the cost?");
                    double cost = input.nextDouble();

                    collection.add(title, director, year, cost);
                    break;

                case 2:
                    collection.showAll();
                    break;

                default:
                    break;
            }

        } while (choice != 0);

        input.close();

    }
}
