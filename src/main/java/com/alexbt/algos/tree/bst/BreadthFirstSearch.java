package com.alexbt.algos.tree.bst;

import com.alexbt.algos.util.BstNode;
import com.alexbt.algos.util.Visitor;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void traversal(BstNode root) {
        Queue<BstNode> queue = new LinkedList<BstNode>();

        queue.add(root);
        while (!queue.isEmpty()) {
            BstNode node = queue.remove();
            Visitor.visit(node);
            queue.add(node.left);
            queue.add(node.right);
        }
    }
}
