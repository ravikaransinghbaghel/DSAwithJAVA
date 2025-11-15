package Questions.Arrays;

import java.util.*;

public class Kth_largest_element {

    public static void kthlargest(int arr[], int k) {

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 5, 3, 2, 5, 1, 6, 4, 3 };
     
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("k-th largest element is: " + arr[arr.length - k]);

    }
}
