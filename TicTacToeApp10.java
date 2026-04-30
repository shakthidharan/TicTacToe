/**
 * TicTacToe
 * UC10 checks whether the game has ended in a draw
 * by ensuring no empty cells remain on the board.
 */
public class TicTacToe {

    static char[][] board = new char[3][3];

    /**
     * Entry point of the program. Tests draw detection logic.
     */
    public static void main(String[] args) {

        // Filling board with sample values (no empty cells)
        board[0][0] = 'X'; board[0][1] = 'O'; board[0][2] = 'X';
        board[1][0] = 'X'; board[1][1] = 'O'; board[1][2] = 'O';
        board[2][0] = 'O'; board[2][1] = 'X'; board[2][2] = 'X';

        System.out.println(isDraw());
    }

    /**
     * Traverses the board to check for any remaining empty cells.
     * Output: true if draw, false otherwise.
     */
    static boolean isDraw() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '\0' || board[i][j] == '-') {
                    return false; // empty cell found → not draw
                }
            }
        }

        return true; // no empty cells → draw
    }
}