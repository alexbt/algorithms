package com.alexbt.algos.tree.bst;

import java.util.Stack;

import javax.xml.soap.Node;

public class DepthFirstSearchIterative {

    public void inorder(Node node) {
        Stack<Node> stack = new Stack<>();

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            if (!stack.isEmpty()) {
                node = stack.pop();
                visit(node);
                node = node.right;
            }
        }
    }

    public void preorder(Node node) {
        Stack<Node> stack = new Stack<>();

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                visit(node);
                node = node.left;
            }

            if (!stack.isEmpty()) {
                node = stack.pop();
                node = node.right;
            }
        }
    }

}
