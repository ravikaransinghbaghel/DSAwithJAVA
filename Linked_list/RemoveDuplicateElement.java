package Linked_list;

public class RemoveDuplicateElement {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;
    static RemoveDuplicateElement ll = new RemoveDuplicateElement();

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLL(Node first) {
        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNode(Node head) {

        Node temp = head.next;
        Node pre = head;

        while (temp != null) {
            if (temp.data == head.data) {
                temp = temp.next;
                if (temp == null) {
                    pre.next = temp;
                }
            } else {
                pre.next = temp;
                pre = temp;
                temp = temp.next;
            }

        }

    }

    public void removeDuplicate() {
        // RemoveDuplicateElement ll = new RemoveDuplicateElement();
        if (head == null) {
            System.out.println("list is empty");

        } else {
            Node temp = head;
            while (temp != null) {
                ll.deleteNode(temp);
                temp = temp.next;
            }
        }
    }

    public static void main(String str[]) {

        ll.addLast(12);
        ll.addLast(11);
        ll.addLast(12);
        ll.addLast(21);
        ll.addLast(41);
        ll.addLast(43);
        ll.addLast(21);

        ll.printLL(head);
        ll.removeDuplicate();
        ll.printLL(head);

        // Node temp = new Node(20);
        // temp = temp.next;
        // Node pe = new Node(20);
        // // pe.next = temp;
        // System.out.println(pe.next);
    }

}
