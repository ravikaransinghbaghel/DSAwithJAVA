package Questions.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int nums[] = { -1, 1, 0, -3, 3 };
        int ans[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    ans[i] = nums[j] * ans[i];
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}