package searching;

public class linearsearch {
    public static int linear(int agr[], int key) {
        for (int i = 0; i < agr.length; i++) {
            if (key == agr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int agr[] = { 2, 4, 2, 5, 57, 8, 6, 5, 4, 3, 4, };
        int a = linear(agr, 3);
        if (a == -1) {
            System.out.println("element is not found");
        } else {
            System.out.println("index is " + a + "  and element is " + agr[a]);
        }
    }
}