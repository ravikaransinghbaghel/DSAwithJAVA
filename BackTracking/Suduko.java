package BackTracking;

public class Suduko {

    public static boolean isSatf(int suduko[][], int col, int row, int digit) {

        // check row
        for (int j = 0; j < suduko.length; j++) {
            if (suduko[row][j] == digit) {
                return false;
            }
        }

        // check column
        for (int i = 0; i < suduko.length; i++) {
            if (suduko[i][col] == digit) {
                return false;
            }
        }

        // check sub grid (3*3)

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (suduko[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sududoSolver(int suduko[][], int col, int row) {
        // base case
        if (col == 9) {
            return true;
        }

        // recursion
        int nextRow = row + 1, nextCol = col;
        if (row + 1 == 9) {
            nextCol = col + 1;
            nextRow = 0;
        }

        if (suduko[row][col] != 0) {
            return sududoSolver(suduko, nextCol, nextRow);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSatf(suduko, col, row, digit)) {
                suduko[row][col] = digit;
                if (sududoSolver(suduko, nextCol, nextRow)) {
                    return true;
                }
                suduko[row][col] = 0;
            }
        }
        return false;
    }

    public static void printBoard(int board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int suduko[][] = {
                { 8, 0, 1, 0, 0, 4, 0, 0, 0 },
                { 2, 0, 0, 0, 0, 0, 7, 0, 0 },
                { 3, 4, 0, 7, 6, 0, 5, 0, 0 },
                { 0, 0, 3, 0, 0, 5, 9, 0, 7 },
                { 0, 0, 0, 6, 7, 8, 0, 3, 2 },
                { 0, 2, 7, 0, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 8, 6, 5 },
                { 0, 0, 0, 1, 2, 0, 0, 0, 0 },
                { 7, 6, 4, 0, 8, 3, 0, 0, 0 }
        };

        if (sududoSolver(suduko, 0, 0)) {
            System.out.println("solution is posible");
            printBoard(suduko);
        } else {
            System.out.println("solution is not posible ");
        }

    }
}
