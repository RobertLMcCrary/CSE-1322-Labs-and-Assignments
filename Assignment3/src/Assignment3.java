/*
Class: CSE 1322L
Section: J01
Term: Spring Semester 2024
Instructor: Nisha Bagdwal
Name: Robert McCrary
Lab#: Assignment 3
 */

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Assignment3 {
    public static Pokemon spawn() {
        Random random = new Random();
        int level = random.nextInt(21);
        int pokemonType =random.nextInt(4);

        switch (pokemonType) {
            case 1:
                return new Bulbasaur(level);

            case 2:
                return new Charmander(level);

            default:
                return new Caterpie(level);
        }
    }

    public static float throwBall() {
        Scanner input = new Scanner(System.in);

        System.out.println("What type of ball do you wish to use? (Poke, Great, Ultra) ");
        String ballType = input.nextLine();

        float ballMultiplier;

        switch (ballType.toLowerCase()) {
            case "great":
                ballMultiplier = 1.5f;
                break;

            case "ultra":
                ballMultiplier = 2.0f;
                break;

            default:
                ballMultiplier = 1.0f;
                break;
        }

        System.out.println("What berry do you wish to use? (None, Razz, SilverPinap, GoldenRazz) ");
        String berryType = input.nextLine();

        float berryMultiplier;

        switch (berryType.toLowerCase()) {
            case "razz":
                berryMultiplier = 1.5f;
                break;

            case "silvernap":
                berryMultiplier = 1.8f;
                break;

            case "goldenrazz":
                berryMultiplier = 2.5f;
                break;

            default:
                berryMultiplier = 1.0f;
                break;
        }

        System.out.println("Is this a curveball? (Yes or No) ");
        String isCurve = input.nextLine();
        float curveMultiplier;

        if (isCurve.equalsIgnoreCase("yes")) {
            curveMultiplier = 1.7f;
        }
        else {
            curveMultiplier = 1.0f;
        }

        return ballMultiplier * berryMultiplier * curveMultiplier;
    }

    public static void main(String[] args) {
        Pokedex myDex = new Pokedex();
        boolean isCatching = true;

        while (isCatching) {
            Pokemon encounterPokemon = spawn();
            System.out.println("You encounter " + encounterPokemon.toString());

            float multiplier = throwBall();
            double bcr = encounterPokemon.getBaseCatchRate();
            double cpm = 0.49985844;
            double catchingProbability = 1 - Math.pow((1 - (bcr/(2*cpm))), multiplier);

            if (Math.random() < catchingProbability) {
                System.out.println("A level " + encounterPokemon.getLevel() + " " + encounterPokemon.getClass().getSimpleName() + " Caught!");
                myDex.addToDex(encounterPokemon);
            }
            else {
                System.out.println("Oops, " + encounterPokemon.toString() + " jumped out, try again!");
                continue;
            }

            Scanner input = new Scanner(System.in);
            System.out.print("Continue Catching Pokemon? (Y or N) ");
            String continueCatching = input.nextLine();

            if (continueCatching.equalsIgnoreCase("n")) {
                isCatching = false;
            }
        }

        System.out.println(myDex.toString());
    }
}
