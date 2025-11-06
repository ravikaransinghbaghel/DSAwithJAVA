package BackTracking;

public class Grid_ways {

    public static void printBoard(char board[][]) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // (n-1,m-1) to (0,0)

    // public static int Totalways(int n, int m) {
    //     if (n == 0 || m == 0) {
    //         return 1;
    //     }

    //     // right diraction
    //     int w1 = Totalways(n, m - 1);

    //     // down diraction
    //     int w2 = Totalways(n - 1, m);

    //     return w1 + w2;
    // }

    // (0,0) to (n-1,m-1)
    public static int Totalways(int i, int j, int n, int m) {
    if (n - 1 == i || m - 1 == j) {
    return 1;
    }

    // right diraction
    int w1 = Totalways(i, j + 1, n, m);

    // down diraction
    int w2 = Totalways(i + 1, j, n, m);

    return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 6, m = 5;
        // int grid[][] = new int[n][m];

        System.out.println(Totalways(0, 0, n, m));
        // System.out.println(Totalways(n - 1, m - 1)); // (n,m) to (0,0)
    }
}
