/**
 * TicTacToe
 * UC8 controls the continuous game loop and alternates
 * turns until the game ends.
 */
public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    /**
     * Entry point of the program. Demonstrates the structure
     * of a continuous game loop.
     */
    public static void main(String[] args) {
        
        System.out.println("--- Welcome to Tic-Tac-Toe ---");

        // The continuous game loop
        while (!gameOver) {
            
            if (isHumanTurn) {
                System.out.println("\n[Human's Turn]");
                // humanMove(); // Logic from UC3/UC6 would go here
            } else {
                System.out.println("\n[Computer's Turn]");
                // computerMove(); // Logic from UC7 would go here
            }

            // Alternating turns: flip the boolean
            isHumanTurn = !isHumanTurn;

            // Simple logic to prevent an infinite loop during testing
            // In a real game, checkWin() or checkDraw() would set gameOver = true
            gameOver = true; 
            System.out.println("Turn cycle completed. Game Over set to true for demo.");
        }
    }
}