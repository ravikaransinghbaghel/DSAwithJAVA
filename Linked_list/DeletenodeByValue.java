package Linked_list;

import java.util.*;

public class DeletenodeByValue {

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

    public void deleteNode(int data) {
        if (head == null) {
            System.out.println("list is empty");

        } else if (head.data == data) {
            head = head.next;

        } else {

            int found = 0;
            Node temp = head;
            Node pre = null;

            while (temp != null) {

                if (temp.data == data) {
                    pre.next = temp.next;
                    found = 1;
                    break;
                }
                pre = temp;
                temp = temp.next;
            }
            if (found == 0) {
                System.out.println("data is not in the list");

            }
        }

    }

    public static void main(String str[]) {
        DeletenodeByValue ll = new DeletenodeByValue();
        Scanner sc = new Scanner(System.in);

        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(70);
        ll.addLast(80);

        System.out.print("enter the data for deletion : ");
        int data = sc.nextInt();
        System.out.println();
        ll.deleteNode(data);

        ll.printLL(head);

    }
}
