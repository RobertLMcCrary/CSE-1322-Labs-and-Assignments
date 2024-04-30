/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 9
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fileOneName;
        String fileTwoName;

        System.out.print("Input file 1 path: ");
        fileOneName = input.nextLine();
        System.out.print("Input file 2 path: ");
        fileTwoName = input.nextLine();

        File fileOne = new File(fileOneName);
        File fileTwo = new File(fileTwoName);

        try {
            Scanner scanner1 = new Scanner(fileOne);
            Scanner scanner2 = new Scanner(fileTwo);

            int lineNum = 1;

            while (scanner1.hasNextLine() && scanner2.hasNextLine()) {
                String line1 = scanner1.nextLine();
                String line2 = scanner2.nextLine();

                System.out.println("Line " + lineNum);
                System.out.println("< " + line1);
                System.out.println("> " + line2);
		
                lineNum++;
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
