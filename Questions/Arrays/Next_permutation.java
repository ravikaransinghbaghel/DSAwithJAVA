package Questions.Arrays;

public class Next_permutation {

    public static int factorial(int arr[]) {
        int fact = 1;
        for (int i = 1; i <= arr.length; i++) {
            fact = i * fact;
        }
        return fact;
    }

    public static void printAllPermutation(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int fact = factorial(arr);
        for (int i = 0; i < fact - 1; i++) {
            permutation(arr);
        }
    }

    public static void permutation(int arr[]) {
        int i = arr.length - 1;
        while (i >= 0 && arr[i] <= arr[i - 1]) {
            i--;
        }

        // System.out.println(arr[i]);
        if (i >= 0) {
            int j = arr.length - 1;
            while (j >= 0 && arr[j] < arr[i - 1]) {
                j--;

            }
            // System.out.println(arr[j]);
            swip(arr, i - 1, j);
        }
        reverse(arr, i);

        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
        System.out.println();
    }

    public static void swip(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int i) {
        int j = arr.length - 1;
        while (i < j) {
            swip(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        printAllPermutation(arr);

    }
}
