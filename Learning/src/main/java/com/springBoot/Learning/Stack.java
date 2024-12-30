package com.springBoot.Learning;

public class Stack {
    private Node top;
    private int height;


    public Stack(int value) {
        Node newNode = new Node(value);
        this.top = newNode;
        height = 1;
    }

    public void getTop() {
        if (top == null) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println("Printing values -:" + temp.value);
            temp = temp.next;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            Node temp = top;
            newNode.next = temp;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        Node temp = top;
        if (height == 0) {
            return null;
        } else {

            top = temp.next;
            temp.next = null;
            height--;
        }
        return temp;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }


}
