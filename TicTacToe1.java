// TicTacToe
// Unit initializes and displays an empty Tic-Tac-Toe board in a proper
// grid format. This uses nested loops to iterate over rows and columns.

class TicTacToe {

    static char[][] board = new char[3][3];

    // Entry point of the program. Initializes the board and prints it.
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    // Initializes the 3x3 board by filling each cell with '-' to indicate
    // an empty position. Students should focus on nested loops usage.
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    // Prints the Tic-Tac-Toe board using horizontal and vertical separators
    // so that the grid structure is clearly visible to the user.
    static void printBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);
                if (col < 2) System.out.print(" | ");
            }
            System.out.println();
            if (row < 2) System.out.println("---------");
        }
    }
}