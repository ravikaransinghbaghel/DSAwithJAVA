package Arrays;

import java.util.*;

public class IOarray {
    public static void main(String[] args) {
        // int agr[] = { 1, 3, 23, 4, 2, 2, 4, 23, 2, 3 };
        // for (int i = 0; i < agr.length; i++) {
        // System.err.print(agr[i] + " ");
        // }
        Scanner sc = new Scanner(System.in);
        int n;
        System.err.print("enter the catecity of arrey : ");
        n = sc.nextInt();
        int agr[] = new int[n];

        for (int i = 0; i < agr.length; i++) {
            System.out.println("enter the element in array"+(i+1));
            agr[i] =sc.nextInt();
        }

        for (int i = 0; i < agr.length; i++) {
        System.err.print(agr[i] + " ");
        }
    }

}