/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 8
 */

import java.util.Scanner;

public class Lab8 {
    private static int calculateSeconds(String str) throws Exception {
        try {
            //splitting at the colons to get the individual number of hours, minutes and seconds
            String[] timeSlots = str.split(":", 3);

            int hours = Integer.parseInt(timeSlots[0]);
            int minutes = Integer.parseInt(timeSlots[1]);
            int seconds = Integer.parseInt(timeSlots[2]);

            if (hours < 0 || hours >= 24) {
                throw new InvalidTimeException("Hour must be between 0 and 23");
            }

            if (minutes < 0 || minutes >= 60) {
                throw new InvalidTimeException("Minutes must be between 0 and 59");
            }

            if (seconds < 0 || seconds >= 60) {
                throw new InvalidTimeException("Seconds must be between 0 and 59");
            }

            if (str.length() < 8) {
                throw new InvalidTimeException("Enter a valid time");
            }

            //calculate the total number of seconds
            return Math.abs((hours * 60 * 60) + (minutes * 60) + seconds);
        }
        catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new InvalidTimeException("Invalid input format. Please enter time in HH:MM:SS format.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            String time1 = input.nextLine();
            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            String time2 = input.nextLine();

            int seconds1 = calculateSeconds(time1);
            int seconds2 = calculateSeconds(time2);

            int difference = seconds1 - seconds2;

            System.out.println("Difference in seconds: " + difference);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
