package Recursion;

public class TilesProblem {

    public static int countWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int vertical = countWays(n - 1);
        int horizontal = countWays(n - 2);
        return vertical + horizontal;
    }

    public static void main(String[] args) {

        int n = 4;
        System.out.println("Number of ways to tile " + n + "x1 floor: " + countWays(n));
    }
}