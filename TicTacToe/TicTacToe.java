import java.util.Random;

/**
 * TicTacToe
 * UC7 allows the computer to make a random valid move
 * by reusing slot conversion and validation logic.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    /**
     * Entry point of the program. Triggers the computer move.
     */
    public static void main(String[] args) {
        computerMove();
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random random = new Random();
        int slot, row, col;

        while (true) {
            // Generate a random slot between 1 and 9
            slot = random.nextInt(9) + 1; 
            
            // Reuse conversion logic (UC4)
            row = getRowFromSlot(slot);
            col = getColFromSlot(slot);

            // Reuse validation logic (UC5)
            if (isValidMove(row, col)) {
                board[row][col] = computerSymbol;
                System.out.println("Computer selected slot: " + slot);
                break; // Exit the loop once a valid move is placed
            }
        }
    }

    // --- Helper methods from previous Use Cases ---

    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    static boolean isValidMove(int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (board[row][col] == '-') {
                return true;
            }
        }
        return false;
    }
}