/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 10
 */

class Lab10 {
    public static void main(String[] args) {
        //named Noah, Olivia, Liam, Emma, Amelia

        Thread b1 = new Thread(new Baby("Noah"));
        Thread b2 = new Thread(new Baby("Olivia"));
        Thread b3 = new Thread(new Baby("Liam"));
        Thread b4 = new Thread(new Baby("Emma"));
        Thread b5 = new Thread(new Baby("Amelia"));

        b1.start();
        b2.start();
        b3.start();
        b4.start();
        b5.start();

    }
}