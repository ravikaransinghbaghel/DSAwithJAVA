package Recursion;

public class FreindPairing {

    public static int freindPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // choice 1 : single
        int single = freindPairing(n - 1);

        // choice 2 : pair
        int pair = (n - 1) * freindPairing(n - 2);

        return single + pair;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Number of ways to pair " + n + " friends: " + freindPairing(n));
    }
}
