package Arrays2D;

public class sumofbothdiagonalofmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            sumPrimaryDiagonal += matrix[i][i];
            if (!(i == (n - 1 - i))) {
                sumSecondaryDiagonal += matrix[i][n - 1 - i];
            }
        }

        System.out.println("Sum of Primary Diagonal: " + sumPrimaryDiagonal);
        System.out.println("Sum of Secondary Diagonal: " + sumSecondaryDiagonal);
        System.out.println("sum of both diagonal : "+(sumPrimaryDiagonal+sumSecondaryDiagonal));
    }
}
