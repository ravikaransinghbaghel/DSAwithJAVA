package Questions.Arrays;

public class PairSumForEqualGivenValue {

    // public static boolean findPairsWithSum(int[] arr, int targetValue) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] + arr[j] == targetValue) {
    // System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
    // return true;
    // }
    // }

    // }

    // return false;
    // }

    public static boolean findPairsWithSum(int num[], int targetSum) {
        int idx = -1;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                idx = i;
            }
        }
        int lidx = idx + 1;
        int ridx = idx;

        while (lidx != ridx) {
            if (num[lidx] + num[ridx] == targetSum) {
                System.out.println("the pair is (" + num[lidx] + "," + num[ridx] + ")");
                return true;

            } else if (num[lidx] + num[ridx] < targetSum) {
                lidx++;
                if (lidx == num.length - 1) {
                    lidx = 0;
                }
            } else {
                ridx--;
                if (ridx == 0) {
                    ridx = num.length - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
        int targetSum = 16;
        // findPairsWithSum(arr, targetSum);
        System.out.println(findPairsWithSum(arr, targetSum));
    }
}
