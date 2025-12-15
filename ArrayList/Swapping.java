package ArrayList;

import java.util.*;

public class Swapping {

    public static void swap(ArrayList<Integer> list, int indx, int indx2) {
        int temp = list.get(indx);
        list.set(indx, list.get(indx2));
        list.set(indx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        swap(list, 0, list.size() - 1);
        System.out.println(list);

    }
}