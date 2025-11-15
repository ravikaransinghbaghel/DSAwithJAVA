package Questions.Arrays;

import java.util.*;

public class chocolate_distributor {

    public static void minDifference(int arr[], int m) {
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int start = 0, end = 0;
        for (int i = 0; i <= arr.length - m; i++) {
            if (arr[i + m - 1] - arr[i] < minDiff) {
                minDiff = arr[i + m - 1] - arr[i];
                start = i;
                end = i + m - 1;
            }

        }

        System.out.println("Minimum difference is: " + minDiff);
        for (int i = 0; i < m; i++) {
            System.out.print(arr[start + i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 4, 9, 12, 56 };
        int m = 5;
        minDifference(arr, m);
    }
}
