import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private void PrintMenu() {
        System.out.println("Choose your language");
        System.out.println("1. English");
        System.out.println("2. Español");
        System.out.println("3. Français");
        System.out.println("4. 简体中文");
    }

    public void play_game() {
        Random myRand = new Random();
        int randMain = myRand.nextInt(100);

        Scanner input = new Scanner(System.in);

        PrintMenu();
        int choice = input.nextInt();

        Language language = null;

        switch (choice) {
            case 1:
                language = new English();
                break;

            case 2:
                language = new Spanish();
                break;

            case 3:
                language = new French();
                break;

            case 4:
                language = new SimplifiedChinese();
                break;

            default:
                System.out.println("Invalid choice. Exiting...");
                break;
        }

        while (true) {
            System.out.println(language.make_guess());
            int userGuess = input.nextInt();

            if (userGuess < randMain) {
                System.out.println(language.too_low());
            } else if (userGuess > randMain) {
                System.out.println(language.too_high());
            } else {
                System.out.println(language.correct());
                break;
            }
        }


        input.close();

    }
}
