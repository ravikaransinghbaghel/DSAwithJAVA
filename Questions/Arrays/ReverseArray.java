package Questions.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = { 2, 37, 16, 34, 62, 31, 6, 43 };
        int j = arr.length - 1;
        int i = 0;
        while (i < arr.length / 2) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}