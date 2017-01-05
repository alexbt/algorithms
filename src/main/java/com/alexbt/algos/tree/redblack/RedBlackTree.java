package com.alexbt.algos.tree.redblack;

public class RedBlackTree {

    private Node root;

    public Node insert(Node node) {
        Node current = root;
        while (current != null) {
            if (node.val < current.val) {
                if (current.left == null) {
                    current.left = node;
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = node;
                    break;
                } else {
                    current = current.right;
                }
            }
        }

        if (root == null) {
            root = node;
        }

        return root;
    }

    public void insertRec(Node node) {
        if (root == null) {
            root = node;
        } else {
            insertRec(root, node);
        }
    }

    public Node insertRec(Node current, Node node) {
        if (current == null) {
            return node;
        }

        if (node.val < current.val) {
            current.left = insertRec(current.left, node);
            // rotate right
        } else if (node.val > current.val) {
            current.right = insertRec(current.right, node);
            // rotate left
        }

        return current;
    }

    public void rotateLeft(Node parent) {
        parent.right.left = parent;
        parent.right = null;
    }

    public void rotateRight(Node parent) {
        parent.left.right = parent;
        parent.left = null;
    }
}
