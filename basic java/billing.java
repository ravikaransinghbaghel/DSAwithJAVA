import java.util.Scanner;

public class billing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of pencil: ");
        int pencil = scanner.nextInt();
        System.out.print("Enter the price of pen: ");
        int pen = scanner.nextInt();
        System.out.print("Enter the price of eraser: ");
        int eraser = scanner.nextInt();
        double total = (pen + pencil + eraser) * (100 + 18) / 100.0;
        System.out.println("The total bill with gst is: " + total );
    }
}
