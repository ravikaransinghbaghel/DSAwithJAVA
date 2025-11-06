package sorting;

public class insertSort {
    public static void insertionSorting(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > key) {
                    a[j + 1] = a[j];
                    a[j] = key;
                } else {
                    break;
                }
            }
            // if (i == 4) {
            //     break;
            // }
        }
    }

    public static void main(String[] args) {
        int a[] = { 5, 4, 1, 3, 2 };
        insertionSorting(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}