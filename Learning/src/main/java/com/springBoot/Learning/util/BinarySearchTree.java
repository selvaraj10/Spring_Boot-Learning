package com.springBoot.Learning.util;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        Node temp = root;
        if (root == null) {
            root = newNode;
            return true;
        }
        while (true) {
            if (newNode.value == temp.value) {
                return false;
            }
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }

        }

    }

    public boolean contains(int value){
        if(root == null){
            return false;
        }
        Node temp = root;
        while (temp != null){
            if (value == temp.value) {
                return true;
            }
            if(temp.value > value){
                    temp = temp.left;
            }
            else if(temp.value < value) {
                    temp = temp.right;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
