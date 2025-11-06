package BackTracking;

public class FindSubset {

    public static void subset(String sc, String ans, int i) {
        // base case
        if (i == sc.length()) {
            if (ans.length() == 0) {
                System.out.println("NULL");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursion
        // for yes
        subset(sc, ans + sc.charAt(i), i + 1);

        // for no
        subset(sc, ans, i + 1);

    }

    public static void main(String[] args) {
        String sc = "ravi";

        subset(sc, "", 0);

        // String sc1 = "";
        // System.out.println(sc.length());
        // String sc2 = sc1 + sc.charAt(0);
        // System.out.println(sc2);

    }
}
