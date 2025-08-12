package com.kiran.practicePrograms.linkedList;


public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print(); 
        list.reverse();
        list.print();
    }
}
