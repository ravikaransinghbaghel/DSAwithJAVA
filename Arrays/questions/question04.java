package Arrays.questions;

public class question04 {

    public static int[] leftAuxilary(int a[]) {
        int n = a.length;
        int leftauxi[] = new int[n];
        leftauxi[0] = a[0];
        for (int i = 1; i < n; i++) {
            leftauxi[i] = Math.max(leftauxi[i - 1], a[i]);
        }
        return leftauxi;
    }

    public static int[] rightAuxilary(int a[]) {
        int n = a.length;
        int rightauxi[] = new int[n];
        rightauxi[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightauxi[i] = Math.max(rightauxi[i + 1], a[i]);
        }
        
        return rightauxi;
    }

    public static int tappingWater(int a[]) {
        int left[] = leftAuxilary(a);
        int right[] = rightAuxilary(a);
        int n = a.length;
        int tapWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(right[i], left[i]);
            tapWater += (waterLevel - a[i]);
        }
        return tapWater;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println(tappingWater(arr));
    }
}
 