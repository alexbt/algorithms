package com.alexbt.algos.tree.bst;

public class ValidateIsBST {

    public static void main(String[] args) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isValid(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data < min || node.data > max) {
            return false;
        }

        return isValid(node.left, min, node.data - 1) && isValid(node.right, node.data + 1, max);
    }
}
