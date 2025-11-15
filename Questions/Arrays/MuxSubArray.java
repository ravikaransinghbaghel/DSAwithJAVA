package Questions.Arrays;

public class MuxSubArray {

  // using kadan algorithm--
  public static void kadanAlgorithm(int arr[]) {
    int max = Integer.MIN_VALUE;

    int cs = 0;
    for (int i = 0; i < arr.length; i++) {
      cs += arr[i];
      if (cs < 0) {
        cs = 0;
      }
      if (max < cs) {
        max = cs;
      }
    }

    System.out.println("the mux. sum of subArray : " + max);

  }

  // using prefix --
  public static void prefixArray(int arr[]) {
    int prefix[] = new int[arr.length];
    int max = Integer.MIN_VALUE;
    int cs = 0;
    prefix[0] = arr[0];

    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }

    for (int i = 0; i < prefix.length; i++) {
      for (int j = 0; j < prefix.length; j++) {
        cs = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
        max = Math.max(max, cs);
      }
    }

    System.out.println("the mux. sum of subArray : " + max);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 5 };
    int max = Integer.MIN_VALUE;

    // kadanAlgorithm(arr);
    prefixArray(arr);

  }
}
