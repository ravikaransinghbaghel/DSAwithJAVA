public class reversArrayUsingTempVariable {

    public static void main(String[] args) {
        int a[] = { 1, 4, 23, 24, 64, 2, 46, 4 };
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];

        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}  