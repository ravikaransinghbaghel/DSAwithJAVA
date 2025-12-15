package Linked_list;

public class ReverseLInkedlist {

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

    public void reverseLL() {
        Node prev = null;
        Node curr = tail = head;// value of curr and tail is value of head
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev; // value of head is vlaue of last node
    }

    public static void main(String[] args) {
        ReverseLInkedlist ll = new ReverseLInkedlist();
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
        ll.printLL();
        ll.reverseLL();
        ll.printLL();
        // System.out.println(tail.data);
        ll.reverseLL();
        ll.printLL();
        // System.out.println(tail.data);
    }
}
