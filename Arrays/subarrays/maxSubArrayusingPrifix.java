package Arrays.subarrays;

public class maxSubArrayusingPrifix {

    public static void maxSubArray(int a[]) {

        int prefix[] = new int[a.length];
        prefix[0] = a[0];
        int cs = 0, maxsum = Integer.MIN_VALUE;
        for (int i = 1; i < a.length; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        // prefix={4,-1,4,36,30,28}
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                int start = i, end = j;
                cs = start == 0 ? prefix[start] : prefix[end] - prefix[start - 1];
                maxsum = Math.max(cs, maxsum);
            }
        }

        System.out.println("the maximum sum of subArray is : " + maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { 4, -5, 5, 32, -6, -2 };
        maxSubArray(arr);
    }
}
