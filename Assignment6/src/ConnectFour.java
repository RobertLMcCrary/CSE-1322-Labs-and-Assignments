import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;


public class ConnectFour {
    public static char[][] board = new char[6][7];
    private String currentTurn;
    private char nextToken;

    public ConnectFour() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = ' ';
            }
        }
        currentTurn = "red";
        nextToken = 'R';
   }

    public String getCurrentTurn() {
        return currentTurn;
    }    

    public char getCurrentToken() {
        return nextToken;
    }

    public void nextTurn() {
        if (currentTurn.equalsIgnoreCase("red") && nextToken == 'R') {
            currentTurn = "Yellow";
            nextToken = 'Y';
        } else if (currentTurn.equalsIgnoreCase("yellow") && nextToken == 'Y') {
            currentTurn = "Red";
            nextToken = 'R';
        }
    }

    public int nextAvailablePosition(int col) {
        for (int i = 5; i >= 0; i--) {
            if (board[i][col] == ' ') {
                return i;
            }
        }
        return -1;
    }

    public void dropPiece(int col, char token) throws ColumnFull {
        int row = nextAvailablePosition(col);


        board[row][col] = nextToken;
    }

    
    @Override
    public String toString() {
        String to_return = "  0   1   2   3   4   5   6";
        for (int i = 0; i < 6; i++) {
            to_return += "\n-----------------------------\n";
            to_return += "| ";
            for (int j = 0; j < 7; j++) {
                to_return += board[i][j] + " | ";
            }
        }
        to_return += "\n-----------------------------\n";
        return to_return;
    }


    public void saveGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a filename");
        String fileName = input.nextLine();
        File savedGame = new File(fileName);
        try {

            if (savedGame.createNewFile()){
                System.out.println("Saved game created: " + savedGame.getName());
                PrintWriter printWriter;

                try {
                    printWriter = new PrintWriter(savedGame);
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 7; j++) {
                            printWriter.print(board[i][j] + ",");
                        }
                        printWriter.println();
                    }
                    printWriter.close();
                }
                catch(IOException e) {
                    System.out.println("Something went wrong when writing the data into the file");
                    System.err.println(e.getMessage());
                }
            }
            else {
                System.out.println("A game with the name: " + savedGame.getName() + " already exists");
            }
            
        }
        catch (IOException e) {
            System.out.println("Something went wrong when saving the game...");
            System.err.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("En error occured while saving the file");
            System.err.println(e.getMessage());
        }

    }

    public void loadGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        String fileName = input.nextLine();

        try {
            Scanner scan = new Scanner(fileName);
            int row = 0;

            while (scan.hasNextLine()) {
                String[] fileLine = scan.nextLine().split(",");
                
                for (int i = 0; i < 7; i++) {
                    if (fileLine[i].length() > 1) {
                        throw new InputMismatchException("More tokens than expected");
                    }
                    board[row][i] = fileLine[i].charAt(0);
                }
                row++;
            }
        }
       catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
  }

}

