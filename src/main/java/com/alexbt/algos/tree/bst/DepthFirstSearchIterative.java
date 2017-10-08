package com.alexbt.algos.tree.bst;

import com.alexbt.algos.util.BstNode;
import com.alexbt.algos.util.Visitor;

import java.util.Stack;

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

    public void inorder2(BstNode node) {
        Stack<BstNode> stack = new Stack<>();

        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            }

            if (node == null && !stack.isEmpty()) {
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
