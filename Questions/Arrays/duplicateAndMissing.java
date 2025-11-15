package Questions.Arrays;

import java.util.*;

public class duplicateAndMissing {
    public static int[] repeatingAndMissing(int[] Arr) {

        Arrays.sort(Arr);

        // int maxNum = Arr[Arr.length - 1];

        for (int i = 1; i < Arr.length; i++) {
            if (Arr[i - 1] != i) {
                for (int j = i - 1; j < Arr.length - 1; j++) {
                    if (Arr[j] == Arr[j - 1]) {
                        return new int[] { Arr[j], i };
                    }
                }

            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int Arr[] = { 1, 2, 3, 3, 5, 6, 7, 8, 9 };
        int result[] = repeatingAndMissing(Arr);
        System.out.println("The repeating number is: " + result[0]);
        System.out.println("The missing number is: " + result[1]);
    }
}
