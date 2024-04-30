/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Lab 1
 */

import java.util.Random;

class Assignment7 {
    private static int MAX = 10000;

    public static int findFactor(int target, Prime prime) {
        for (int i = 0; i < prime.primeList.size(); i++) {
            int primeNum = prime.getPrime(i);
            if (primeNum != 0 && target % primeNum == 0) {
                return primeNum;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Prime prime = new Prime(MAX);
        Random random = new Random();

        int target;

        do {
            target = random.nextInt(MAX - 1) + 2;
        } while (prime.isPrime(target));

        System.out.println("What primes make up " + target + "?");

        int factor;

        while (target >= 2) {
            factor = findFactor(target, prime);
            System.out.println(factor);
            target /= factor;

            if (target >= 2) {
                System.out.print("x");
            }
        }
        System.out.println();

    }
}