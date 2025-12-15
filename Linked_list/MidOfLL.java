package Linked_list;

public class MidOfLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public void addNodelast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void midNode() {
        Node fast = head;
        Node slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        System.out.println("the mid of Linked list is : " + slow.data);
    }

    public static void main(String[] args) {
        MidOfLL ll = new MidOfLL();
        ll.addNodelast(1);
        ll.addNodelast(2);
        ll.addNodelast(3);
        ll.addNodelast(4);
        ll.addNodelast(5);
        ll.addNodelast(6);
        ll.addNodelast(7);
        ll.addNodelast(8);
        ll.addNodelast(9);
        ll.addNodelast(10);
        ll.midNode();

        Node a = new Node(20);
        tail.next = a;
        tail = a;
        System.out.println(a.data);
        ll.printLL();
    }

}
