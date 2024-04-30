/*
Assignment#: Assignment 6
 */

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ConnectFour connectFour = new ConnectFour();
        int choice;
        do {

            System.out.println("Which column would " + connectFour.getCurrentTurn() + " like to go in (7 to save, 8 to load, 9 to quit");
            choice = input.nextInt();
	    
	    
            if (choice < 7) {
                try {
                    connectFour.dropPiece(choice, connectFour.getCurrentToken());
                }
                catch(ColumnFull e) {
                    System.err.println(e.getMessage());
                }
                
            }
            else if (choice == 7) {
                connectFour.saveGame();
            }
            else if (choice == 8) {
                connectFour.loadGame();
            }
            else if (choice == 9) {
                break;
            }

            System.out.print(connectFour.toString());

        } while(choice != 9);
	
	        
	input.close();
    }
}
