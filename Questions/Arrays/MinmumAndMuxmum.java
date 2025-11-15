package Questions.Arrays;

import java.util.*;

public class MinmumAndMuxmum {
   public static void main(String[] args) {
      int arr[] = { 2, 37, 16, 34, 62, 31, 6, 43 };
      Arrays.sort(arr);
      System.out.println("Minimum element is: " + arr[0]);
      System.out.println("Maximum element is: " + arr[arr.length - 1]);
   }
}
