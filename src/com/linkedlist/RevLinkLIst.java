package com.linkedlist;

public class RevLinkLIst {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static  void insertnode(int newData){
     Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    static Node reverseLinkedList(Node node) {
       Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        node = prev;
        return node;
    }

    static void printLinkedList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        insertnode(2);
        insertnode(4);
        insertnode(1);
        insertnode(6);
        insertnode(3);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        head = reverseLinkedList(head);

        System.out.println("\nReversed Linked List:");
        printLinkedList(head);
    }
}
