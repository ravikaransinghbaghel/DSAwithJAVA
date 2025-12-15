package Linked_list;

import java.util.LinkedList;

public class StackUsingLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> s = new LinkedList<>();
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        s.addFirst(4);
        s.addFirst(5);
        s.addFirst(6);
 
        System.out.println(s.peek());

    }
}
