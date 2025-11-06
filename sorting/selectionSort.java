package sorting;

public class selectionSort {

    public static void selectionSorting(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }

            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            // if (i == 2) {
            // break;
            // }
        }

    }

    public static void main(String[] args) {
        int[] a = { 25,66, 34, 61, 22, 3 };
        selectionSorting(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
