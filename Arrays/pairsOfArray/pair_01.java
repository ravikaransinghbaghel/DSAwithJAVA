package Arrays.pairsOfArray;

public class pair_01 {

    public static void main(String[] args) {
        int a[] = { 1, 82, 35, 42, 15, 6, 37, 8 };
        int sum = 0;
        int large = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i <a.length; i++) {
            // sum+=5-i-1;
            for (int j = i + 1; j < a.length; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ") ");
                sum++;
                if (a[i] + a[j] > large) {
                    large = a[i] + a[j];
                    x = a[i];
                    y = a[j];
                }
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + sum);
        System.out.println("Largest pair's sum: " + large + " and pair is (" + x + "," + y + ")");
    }
}
