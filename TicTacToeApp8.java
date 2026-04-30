/**
 * TicTacToe
 * UC8 controls the continuous game loop and alternates
 * turns until the game ends.
 */
public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    /**
     * Entry point of the program.
     * Runs continuous game loop until win or draw.
     */
    public static void main(String[] args) {

        while (!gameOver) {

            printBoard();

            if (isHumanTurn) {
                System.out.println("Human's Turn");
                // You can replace with actual input logic
                humanMove(1, 1); // sample move
            } else {
                System.out.println("Computer's Turn");
                computerMove();
            }

            // Check game status
            if (checkWin()) {
                printBoard();
                System.out.println((isHumanTurn ? "Human" : "Computer") + " Wins!");
                gameOver = true;
            } else if (checkDraw()) {
                printBoard();
                System.out.println("It's a Draw!");
                gameOver = true;
            }

            // Switch turn
            isHumanTurn = !isHumanTurn;
        }
    }

    // Sample human move (you can replace with Scanner input)
    static void humanMove(int row, int col) {
        if (isValidMove(row, col)) {
            board[row][col] = 'X';
        }
    }

    // Simple computer move (first empty cell)
    static void computerMove() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    board[i][j] = 'O';
                    return;
                }
            }
        }
    }

    // Check valid move
    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    // Check win condition
    static boolean checkWin() {
        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return true;
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return true;
        }

        // Diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return true;
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return true;

        return false;
    }

    // Check draw condition
    static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // Print board
    static void printBoard() {
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}