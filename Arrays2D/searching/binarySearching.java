package Arrays2D.searching;

public class binarySearching {

    public static int binarysearch(int[][] a, int key) {
        // by (0,m-1)
        int n = 0; // number of rows
        int m = a[0].length - 1; // number of columns

        while (n < a.length && m >= 0) {
            if (a[n][m] == key) {
                System.out.println("Element found at position: (" + n + ", " + m + ")");
                return 0;
            } else if (a[n][m] > key) {
                m--;
            } else {
                n++;

            }
        }

        System.out.println("Element not found in the matrix.");
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int target = 5;
       System.out.println( binarysearch(matrix, target));
    }
}
