/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 1
 */

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Item[] itemArr = new Item[5];

        for (int i = 0; i < itemArr.length; i++) {
            System.out.println("Please enter B for Book or P for Periodical");

            String choice = input.nextLine();

            //converting the user input to lower case so it's not case-sensitive
            if (choice.equalsIgnoreCase("b")) {
                System.out.println("Please enter the name of the Book");
                String bookTitle = input.nextLine();
                System.out.println("Please enter the author of the Book");
                String bookAuthor = input.nextLine();
                System.out.println("Please enter the ISBN of the Book");
                int bookIsbn = Integer.parseInt(input.nextLine());

                itemArr[i] = new Book(bookTitle, bookIsbn, bookAuthor);
            }

            if (choice.equalsIgnoreCase("p")) {
                System.out.println("Please enter the name of Periodical");
                String periodicalTitle = input.nextLine();
                System.out.println("Please enter the issue number");
                int issueNumber = Integer.parseInt(input.nextLine());

                itemArr[i] = new Periodical(periodicalTitle, issueNumber);
            }
        }

        //print the items
        System.out.println("Your Items:");

        for (Item item : itemArr) {
            System.out.println(item.getListing());
            System.out.println();
        }
    }
}
