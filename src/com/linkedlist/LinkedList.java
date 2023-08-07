package com.linkedlist;

import org.w3c.dom.Node;

public class LinkedList {
        static Node head;
        static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        static void insertNode(int newData) {
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

        static void printLinkedList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }

        public static void main(String[] args) {
            insertNode(1);
            insertNode(2);
            insertNode(3);
            insertNode(4);
            insertNode(5);

            System.out.println("Linked List:");
            printLinkedList();
        }
    }


