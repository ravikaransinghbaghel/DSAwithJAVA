import java.util.Scanner;

public class BasicString {

    public static void printString() {
        String str = "ravi karan";
        String str2 = "ravi karan singh";
        String str3 = new String("ravi karan singh");

        Scanner sc = new Scanner(System.in);

        // System.out.println(sc.nextLine());
        System.out.println(str.length());

        if (str.equals(str3)) {
            System.out.println("string is equal");
        } else {
            System.out.println("String is not equal");
        }
    }

    public static void main(String[] args) {
        printString();
    }
}