package Questions.Arrays;

public class TrapWATER {

    public static void trapWater(int height[]) {
        int water = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = 0;
            for (int j = i; j >= 0; j--) {
                leftMax = Math.max(leftMax, height[j]);
            }

            int rightMax = 0;
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            water += Math.min(leftMax, rightMax) - height[i];
        }
        System.out.println("Total water trapped is: " + water);
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 3, 4, 2, 0, 3 }; 
        trapWater(height);
    }
}