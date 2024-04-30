/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 7
 */

import java.util.Scanner;

public class Lab7B {
    private static String repeatNTimes(String str, int n) {
        if (n == 0) {
            return "";
        } else {
            return str + repeatNTimes(str, n - 1);
        }
    }

    //recursive method that checks if the string is a palindrome
    private static boolean isReverse(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        if (str1.isEmpty()) {
            return true;
        }

        if (str1.charAt(0) == str2.charAt(str2.length() - 1)) {
            return isReverse(str1.substring(1), str2.substring(0, str2.length() - 1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(repeatNTimes("I must study recursion until it makes sense\n", 100));

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string");
        String string1 = input.nextLine();
        System.out.println("Enter the second string");
        String string2 = input.nextLine();

        if (isReverse(string1, string2)) {
            System.out.println(string1 + " is the reverse of " + string2);
        }
        else {
            System.out.println(string1 + " is not the reverse of " + string2);
        }
    }
}
