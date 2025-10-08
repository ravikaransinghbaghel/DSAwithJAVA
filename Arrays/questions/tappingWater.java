package Arrays.questions;

public class tappingWater {
    public static int TappingWater(int a[]) {
        int n = a.length;

        // define the left max array
        int leftMax[] = new int[n];
        leftMax[0] = a[0];
        for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(a[i], leftMax[i - 1]);
        }

        // define the right max array
        int rightMax[] = new int[n];
        rightMax[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
        rightMax[i] = Math.max(a[i], rightMax[i + 1]);
        }

        // array left-max and right-max are auxilary arrays of arr(main array) array

        // looping for tapping water
        int tap_water = 0;
        for (int i = 0; i < n; i++) {
        // find the water level (wl) for every bar(element)
        int wl = Math.min(leftMax[i], rightMax[i]);
        tap_water += (wl - a[i]);
        }

    //     int tap_water = 0;
    //     for (int i = 0; i < a.length; i++) {
    //         int left = a[i], right = a[n - 1];
    //         for (int j = 0; j <=i; j++) {
    //             left = Math.max(left, a[j]);
    //         }
    //         for (int j = n - 2; j >= i; j--) {
    //             right = Math.max(right, a[j]);
    //         }

    //         int wl = Math.min(left, right);
    //         tap_water += (wl - a[i]);

    //         System.out.print(" left="+left);
    //         System.out.print(" right="+right);
    //     }
    //     System.out.println();
        return tap_water;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 2, 6, 0, 2, 4, 5 };

        System.out.println(TappingWater(arr));
    }
}