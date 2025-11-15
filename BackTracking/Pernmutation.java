package BackTracking;

public class Pernmutation {

    public static void diffOrder(String sc, String ans) {

        int i = 0;
        char curr = ' ';

        if (sc.length() == 0) {
            System.out.println( ans);
            return;
        }
        for (i = 0; i < sc.length(); i++) {
            curr = sc.charAt(i);
            String new_String = sc.substring(0, i) + sc.substring(i + 1);
            // System.out.println( ans);
            diffOrder(new_String, ans + curr);
        }

    }

    public static void main(String[] args) {
        String sc = "abc";
        diffOrder(sc, "");
    }
}
    