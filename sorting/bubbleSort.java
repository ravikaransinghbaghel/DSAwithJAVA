package sorting;

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
         int a[] = {6,3,6,9,3,9,8,2,5,4,6546,432,543,2435,6542,4,3543,24,5,43,5,346,54,65,5,765,765765,8,67867,86,7657,57,546,54645,75,757,5,7654,646,345,435,34,645765,765,7,6,7655};
        bubbleSorting(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
