package com.alexbt.algos.tree.bst;

import com.alexbt.algos.tree.redblack.Node;

public class InsertDelete {

    public static Node insert(Node current, Node node) {
        if (current == null) {
            return node;
        }

        if (node.val < current.val) {
            current.left = insert(current.left, node);
        } else if (node.val > current.val) {
            current.right = insert(current.right, node);
        } else {
            // throw
        }
        return current;
    }

    public static Node delete(Node current, Node node) {
        if (current == null) {
            return null;
        }

        if (node.val < current.val) {
            current.left = delete(current.left, node);
        } else if (node.val > current.val) {
            current.right = delete(current.right, node);
        } else {
            if (current.left != null && current.right != null) {
                Node predecessor = getMin(current.right);
                current.val = predecessor.val;
                delete(current.right, predecessor);

            } else if (current.left != null) {
                return current.left;
            } else if (current.right != null) {
                return current.right;
            } else {
                return null;
            }
        }
        return current;

    }

    private static Node getMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static void main(String[] args) {
        Node root = insert(null, new Node(10));
        insert(root, new Node(5));
        insert(root, new Node(15));
        insert(root, new Node(18));
        insert(root, new Node(12));
        insert(root, new Node(2));
        insert(root, new Node(7));

        delete(root, new Node(10));
        delete(root, new Node(5));
        System.out.println(root);
    }
}
