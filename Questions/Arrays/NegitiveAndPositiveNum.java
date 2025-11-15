package Questions.Arrays;

public class NegitiveAndPositiveNum {

    public static void rearrange(int arr[]) {
        int temp[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {

                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                temp[index] = arr[i];
                index++;

            }
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { -9, 7, 1, -2, 5, -1, -4, 2, -6, 3, 9, -7, 8, -8, 4 };
        rearrange(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
