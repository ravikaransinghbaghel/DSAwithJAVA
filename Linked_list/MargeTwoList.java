package Linked_list;

// import java.util.LinkedList;

public class MargeTwoList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;
    static Node tail = null;

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void printLL(Node first) {
        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static Node margell = new Node(-1);

    public static Node marge(Node head, Node head2) {
        Node temp = margell;

        while (head != null && head2 != null) {
            if (head.data <= head2.data) {
                temp.next = head;
                head = head.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head != null) {
            temp.next = head;
            head = head.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return margell.next;
    }

    public static void main(String str[]) {
        MargeTwoList ll = new MargeTwoList();
        MargeTwoList ll2 = new MargeTwoList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll2.addLast(2);
        ll2.addLast(4);
        ll2.addLast(6);
        ll2.addLast(7);

        // System.out.println(ll.head.next.next.next.next);
        // System.out.println(ll.head.data);

        printLL(ll.head);
        printLL(ll2.head);
        // System.out.println(marge(ll.head, ll2.head));

        // marge(ll.head, ll2.head);
        printLL(marge(ll.head, ll2.head));

    }
}
