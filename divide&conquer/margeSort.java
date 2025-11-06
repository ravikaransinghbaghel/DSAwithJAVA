public class margeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void marge(int arr[], int si, int ei, int mid) {
        int i = si, j = mid + 1;
        int k = 0;
        int temp[] = new int[ei - si + 1];

        while (i <= mid && j <= ei) {
            if (arr[i] > arr[j]) {
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        // System.out.println(si+" "+ei);
        for ( k = 0, i = si; k < temp.length  ; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static void margesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        margesort(arr, si, mid);// left part
        margesort(arr, mid + 1, ei);// right part

        marge(arr, si, ei, mid);

    }

    public static void main(String[] args) {
        int arr[] = {6,3,6,9,3,9,8,2,5,4,6546,432,543,2435,6542,4,3543,24,5,43,5,346,54,65,5,765,765765,8,67867,86,7657,57,546,54645,75,757,5,7654,646,345,435,34,645765,765,7,6,7655};
        printArr(arr);

        System.out.println("--- after sorted array ---");

        margesort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
