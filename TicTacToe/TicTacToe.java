/**
 * TicTacToe
 * UC10 checks whether the game has ended in a draw
 * by ensuring no empty cells remain on the board.
 */
public class TicTacToe {

    static char[][] board = {
        {'X', 'O', 'X'},
        {'X', 'X', 'O'},
        {'O', 'X', 'O'}
    };

    /**
     * Entry point of the program. Tests draw detection logic.
     */
    public static void main(String[] args) {
        System.out.println("Is the game a draw? " + isDraw());
    }

    /**
     * Traverses the board to check for any remaining empty cells.
     * Output: true if draw, false otherwise.
     */
    static boolean isDraw() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                // If any cell is still empty, it's not a draw yet
                if (board[r][c] == '-') {
                    return false;
                }
            }
        }
        // No empty cells found
        return true;
    }
}