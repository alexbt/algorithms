package com.alexbt.algos.linkedlist;

public class LinkedList {

    private static void findMiddle(Node root) {
        Node first = root;
        Node second = root;

        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }

        System.out.println(first.val);
    }

    private static boolean isCircular(Node root) {
        Node first = root;
        Node second = root;

        first = first.next;

        while (first != null && first != second) {
            first = first.next;
            second = second.next;
        }

        System.out.println(first == second ? "circular" : "not circular");
        return first == second;
    }

    private static Node reverse(Node node) {
        Node root = null;

        while (node != null) {
            Node tmp = node.next;
            node.next = root;
            root = node;
            node = tmp;
        }

        return root;
    }

    static class Node {
        Node next;
        int val;
    }

    public static void main(String[] args) {
        int i = 1;
        Node root = new Node();
        root.val = i++;

        Node node = root;
        node = addNode(node, i++);
        node = addNode(node, i++);
        node = addNode(node, i++);
        node = addNode(node, i++);
        node = addNode(node, i++);
        node = addNode(node, i++);
        node = addNode(node, i++);

        findMiddle(root);
        isCircular(root);
        reverse(root);
    }

    private static Node addNode(Node node, int val) {
        node.next = new Node();
        node = node.next;
        node.val = val;
        return node;
    }
}
