package ArrayList;

import java.util.ArrayList;

public class BasicArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println(list.remove(1) + " removed from index 1");
        System.out.println(list.size() + " is the new size of ArrayList");
        System.out.println(list.contains(10));
    }
}
