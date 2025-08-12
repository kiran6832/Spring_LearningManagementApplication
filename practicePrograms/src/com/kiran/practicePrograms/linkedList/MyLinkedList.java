package com.kiran.practicePrograms.linkedList;


class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

class MyLinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;  // Save next node
            current.next = prev;  // Reverse link
            prev = current;       // Move prev forward
            current = next;       // Move current forward
        }
        head = prev;
    }
}

