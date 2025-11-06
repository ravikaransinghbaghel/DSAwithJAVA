package BackTracking;

public class Basic {
    public static void printRecLoop(int n, int k) {
        // loop + recursion
        if (n == k) {
            System.out.println("base case hit ,n= " + n);
            return;
        }

        for (int i = 0; i < k; i++) {
            System.out.println("before call , n = " +( n + 1) + " and i = " + i);
            printRecLoop(n + 1, k);
            System.out.println("after call , n = " + n + " and i = " + i);
        }

    }

    public static void main(String[] args) {

        printRecLoop(0, 3);
    }
}
