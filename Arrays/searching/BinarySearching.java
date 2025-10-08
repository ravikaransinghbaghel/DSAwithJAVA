package Arrays.searching;

public class BinarySearching {

    public static int binarySearch(int agr[], int key) {
        int l = 0, r = agr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (agr[mid] == key) {
                return mid;
            }
            if (key < agr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int agr[] = { 1, 3, 5, 6, 7, 8, 14, 15, 16, 18 };
        int index = binarySearch(agr, 1);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("index is " + index + " and element is " + agr[index]);
        }
        // System.out.println(0+1/2);
    }
}