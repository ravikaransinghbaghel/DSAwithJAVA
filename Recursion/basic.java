package Recursion;

public class basic {

    public static void descrement(int n, int arr[]) {
        if (n == -1) {
            return;
        }
        // System.out.print(n + " ");
        // System.out.println("hii ravi " + n);
        System.out.print(arr[n] + " ");
        descrement(n - 1, arr);
        System.out.print(arr[n] + " ");

    }

    public static void ascrement(int n) {
        if (n == 0) {
            return;
        }
        ascrement(n - 1);
        System.out.print(n + " ");
        System.out.println("hii ravi " + n);

    }

    public static void main(String[] args) {
        int arr[] = { 6, 36, 7, 3, 1, 5, 24 };
        descrement(arr.length - 1, arr);
    }
}
