public class reveresArraywithout_any_temp_variable {
    public static void revers(int a[]) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }

        System.out.println("the revers array is like ---");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 4, 2, 21, 4, 2, 42, 3 };
        System.out.println("the original array is like ---");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        revers(a);
         System.out.println("\nthe original array is like ---");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
