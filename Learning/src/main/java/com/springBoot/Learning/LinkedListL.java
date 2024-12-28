package com.springBoot.Learning;

public class LinkedListL {
    private Node head;
    private Node tail;
    private int length;

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;

        }
    }

    private LinkedListL (int value){
        Node newNode = new Node(value);
    }



}
