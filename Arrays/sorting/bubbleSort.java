package Arrays.sorting;

public class bubbleSort {

    public static void swapping(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }

    public static void bubbleSorting(int a[]) {
        for (int i = 0; i <= a.length - 2; i++) {
            for (int j = 0; j <= a.length - 2 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] a = { 5, 4, 1, 2, 3 };
        bubbleSorting(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
