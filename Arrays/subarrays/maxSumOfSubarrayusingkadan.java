package Arrays.subarrays;

public class maxSumOfSubarrayusingkadan {
    public static void kadanAlgorithm(int a[]) {
        int cs = 0, ms = Integer.MIN_VALUE;
        int start = 0, end = 0;
        for (int i = 0; i < a.length; i++) {
            cs += a[i];
            if (cs < 0) {
                cs = 0;
                start = i;
            }
            if (cs > ms) {
                ms = cs;
                end = i;
            }
            // ms =Math.max(ms, cs);
        }
        System.out.println("the maximum sum of subArray is : " + ms);
        System.out.println("start : " + start);

        for (int i = start; i <= end; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, -5, 5, 32, -6, -45, -2 };
        kadanAlgorithm(arr);
    }
}