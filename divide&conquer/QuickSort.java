public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pidx = partitioin(arr, si, ei);
        // System.out.println(pidx);
        quickSort(arr, pidx + 1, ei);
        quickSort(arr, si, pidx - 1);
    }

    public static int partitioin(int arr[], int si, int ei) {
        int pivot = ei;
        int i = si-1;

        for (int j = si; j < ei; j++) {
            if (arr[pivot] >= arr[j]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6,3,6,9,3,9,8,2,5,4,6546,432,543,2435,6542,4,3543,24,5,43,5,346,54,65,5,765,765765,8,67867,86,7657,57,546,54645,75,757,5,7654,646,345,435,34,645765,765,7,6,7655};
        printArr(arr);

        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
