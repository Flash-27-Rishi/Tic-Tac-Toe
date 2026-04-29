/**
 * TicTacToe
 * UC5 validates whether a move is inside the board boundaries
 * and whether the selected cell is empty.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    /**
     * Entry point of the program. Tests the validation logic
     * using sample row and column values.
     */
    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1));
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input: Row, Column
     * Output: true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {
        // 1. Check if the row and column are within the valid 0-2 range
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            
            // 2. If they are within bounds, check if the cell is currently empty
            if (board[row][col] == '-') {
                return true; // The move is valid!
            }
        }
        
        // If it's out of bounds OR the cell is already taken, it's invalid
        return false; 
    }
}