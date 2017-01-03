package com.alexbt.algos.tree.bst;

import com.alexbt.algos.util.BstNode;

public class ValidateIsBST {

    public static boolean isValid(BstNode node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.val < min || node.val > max) {
            return false;
        }

        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    }
}
