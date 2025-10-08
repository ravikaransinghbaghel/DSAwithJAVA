package Arrays.pairsOfArray;

public class pair_02 {
    public static void main(String[] args) {
        int a[] = { 1, 3, 23, 45, 3, 23 };
        int sum = 0;
        int large = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i ; j < a.length; j++) {
                System.out.print("( ");
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(a[j2] + ",");
                    if (a[j2] > large) {
                        large = a[j2];
                    }
                }
                System.out.print(") , ");
                sum++ ;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + sum);
    }
}
