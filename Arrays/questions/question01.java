package Arrays.questions;

public class question01 {
    public static boolean leastTwice(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 4, 5, 6, 7, 8, 9 };
        System.out.println(leastTwice(arr));
    }
}
