package Arrays.questions;

public class question03 {
    public static int stock(int a[]) {
        int buystock = Integer.MAX_VALUE;
        int maxProfix = 0;

        for (int i = 0; i < a.length; i++) {
            if (buystock < a[i]) {
                int profix = a[i] - buystock;
                maxProfix = Math.max(maxProfix, profix);
            } else {
                buystock = a[i];
            }
        }
        if (maxProfix == 0) {
            return 0;
        }
        return maxProfix;
    }

    public static void main(String[] args) {
        int arr[] = { 7,6,4,3,2,1 };
        int maxProfix=stock(arr);
        System.out.println(maxProfix);

    }
}
