package Recursion;

public class factorial {

    public static int fectorialOfNumber(int n) {
        if (n == 1) {
            return 1;
        }

        return n * fectorialOfNumber(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fectorialOfNumber(5));
    }
}