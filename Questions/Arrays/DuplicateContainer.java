package Questions.Arrays;

import java.util.*;

public class DuplicateContainer {

    public static void main(String[] args) {
        int arr[] = { 3, 34, 24, 2, 42, 3, 213, 21, 32, 42, 3, 2, 3 };
        // int arr[] = { 1, 3, 4, 5, 6, 7, 8, 9 };
        Arrays.sort(arr);
        int a = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println("container is duplicate .");
                a = 1;
                return;
            }
        }

        if (a == 0) {
            System.out.println("container is not duplicate");
        }
    }
}
