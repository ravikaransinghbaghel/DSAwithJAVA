package Linked_list;

public class Linkedlist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size = 0;

    public void createNodeFirst(int data) {
        Node NewNode = new Node(data);
        if (Head == null) {
            Head = Tail = NewNode;
            size++;
            return;
        }

        NewNode.next = Head;
        Head = NewNode;
        size++;
    }

    public void createNodeAtPosition(int data, int position) {
        Node NewNode = new Node(data);
        if (position == 0) {
            createNodeFirst(data);
            return;
        }
        Node temp = Head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        NewNode.next = temp.next;
        temp.next = NewNode;
        size++;
    }

    public void createNodeLast(int data) {
        Node NewNode = new Node(data);
        if (Head == null) {
            Head = Tail = NewNode;
            size++;
            return;
        }
        Tail.next = NewNode;
        Tail = NewNode;
        size++;
    }

    public void deleteNodeFirst() {
        if (Head == null) {
            System.out.println("Linked List is empty");
            return;
        } else if (size == 1) {
            System.out.println("delete node " + Head.data);
            Head = Tail = null;
            return;
        }
        Head = Head.next;
        size--;
    }

    public void reveseLL() {
        Node curr = Head.next;
        Head.next = null;
        Node pre = Head;
        Node next = curr.next;

        while (next.next != null) {

            curr.next = pre;
            pre = curr;
            curr = next;
            next = next.next;

        }

    }

    public void deleteNodeLast() {
        if (Head == null) {
            System.out.println("Linked List is empty");
            return;
        } else if (size == 1) {
            System.out.println("delete node " + Head.data);
            Head = Tail = null;
            return;
        }
        Node temp = Head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        Tail = temp;
        size--;
    }

    public int backtrack(Node head, int key) {
        if (head == null) {

            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = backtrack(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public void searchNode(int key) {
        System.out.println(backtrack(Head, key));
    }

    public void printList() {
        Node temp = Head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.printList();
        for (int i = 1; i < 11; i++) {
            ll.createNodeFirst(i);
        }
        System.out.println(size);
        // ll.deleteNodeLast();
        // System.out.println(size);
        ll.printList();
        ll.reveseLL();
        ll.printList();

        // System.out.println(Head.data);
    }
}


