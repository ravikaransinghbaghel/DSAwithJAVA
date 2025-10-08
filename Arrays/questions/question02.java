package Arrays.questions;

public class question02 {

    public static int[] rotage(int a[], int key) {
        int num[] = new int[a.length];
        int index = -1;
        for (int i = key; i < num.length; i++) {
            num[++index] = a[i];
        }
        for (int i = 0; i <= key - 1; i++) {
            num[++index] = a[i];
        }
        a = num;
        return a;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int a[] = rotage(arr, 3);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
