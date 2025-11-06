package Recursion;

public class fibonacciNumber {

    public static int NthFibonacciNo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return NthFibonacciNo(n - 1) + NthFibonacciNo(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(NthFibonacciNo(i) + " ");
        }
    }
}
