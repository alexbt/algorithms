package com.alexbt.algos.tree.bst;

import java.util.Stack;

import javax.xml.soap.Node;

public class BreadthFirstSearch {

    public void traversal(Node node) {
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(node);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            visit(node);
            queue.add(node.left);
            queue.add(node.right);
        }
    }
}
