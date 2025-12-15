package Linked_list;

public class CyclingLL {

    static Node head;

    public static boolean isCycling() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        

        head.next.next.next.next = head.next;

        System.out.println(isCycling());
    }

}

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}