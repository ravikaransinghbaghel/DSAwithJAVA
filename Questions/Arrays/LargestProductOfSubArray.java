package Questions.Arrays;

public class LargestProductOfSubArray {

    public static int usingPrefix(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] * arr[i];
        }
        //
        int maxProd = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int prod = i == 0 ? prefix[j] : prefix[j] / prefix[i - 1];
                if (prod > maxProd) {
                    maxProd = prod;
                }
            }
        }
        return maxProd;
    }

    public static int usingKadane(int arr[]) {
        int maxProd = Integer.MIN_VALUE;
        int currProd = 1;
        for (int i = 0; i < arr.length; i++) {
            currProd = currProd * arr[i];
            if (currProd == 0) {
                currProd = 1;
            }
            if (currProd > maxProd) {
                maxProd = currProd;
            }
        }
        return maxProd;
    }

    public static int maxProduct(int arr[]) {
        int maxProd = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod = prod * arr[k];
                }
                if (prod > maxProd) {
                    maxProd = prod;
                }
            }
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int arr[] = { 6, -3, -10, 0, 2 };
        System.out.println("The largest product of subarray is: " + usingKadane(arr));
    }
}
