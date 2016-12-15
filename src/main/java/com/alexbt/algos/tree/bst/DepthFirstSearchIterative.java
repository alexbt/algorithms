package com.alexbt.algos.tree.bst;

import java.util.Stack;

import com.alexbt.algos.util.BstNode;
import com.alexbt.algos.util.Visitor;


public class DepthFirstSearchIterative {

    public void inorder(BstNode node) {
        Stack<BstNode> stack = new Stack<>();

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            if (!stack.isEmpty()) {
                node = stack.pop();
                Visitor.visit(node);
                node = node.right;
            }
        }
    }

    public void preorder(BstNode node) {
        Stack<BstNode> stack = new Stack<>();

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                Visitor.visit(node);
                node = node.left;
            }

            if (!stack.isEmpty()) {
                node = stack.pop();
                node = node.right;
            }
        }
    }

}
