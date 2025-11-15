package Questions.Arrays;

public class rotationArray {

    public static void ratate(int arr[], int pivot, int search) {
        int temp[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (pivot == arr.length - 1) {
                pivot = -1;
            }
            temp[i] = arr[pivot + 1];
            pivot++;
        }

        System.out.println("ratation array is like : ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
        System.out.println();
        int found = -1;
        int j;
        for (j = 0; j < temp.length; j++) {
            if (temp[j] == search) {
                found = 0;
                break;
            }
        }

        if (found == 0) {
            System.out.println("index of " + search + " is " + j);
        } else {
            System.out.println("index of " + search + " is " + -1);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 5 };
        ratate(arr, 2, 4);
    }
}
