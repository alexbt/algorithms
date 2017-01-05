package com.alexbt.algos.tree.bst;

import com.alexbt.algos.util.BstNode;
import com.alexbt.algos.util.Visitor;

public class DepthFirstSearchRecursive {

    public void inorder(BstNode node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        Visitor.visit(node);
        inorder(node.right);
    }

    public void preorder(BstNode node) {
        if (node == null) {
            return;
        }

        Visitor.visit(node);
        inorder(node.left);
        inorder(node.right);
    }

    public void postorder(BstNode node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        inorder(node.right);
        Visitor.visit(node);
    }

}
