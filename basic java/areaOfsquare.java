import java.util.*;

public class areaOfsquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the side of square : ");
        float side = sc.nextFloat();

        float area = side * side;
        System.out.println("the area of aquare is :" + area);
    }

}
