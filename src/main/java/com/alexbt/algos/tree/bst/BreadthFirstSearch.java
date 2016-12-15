package com.alexbt.algos.tree.bst;

import java.util.LinkedList;
import java.util.Queue;

import javax.xml.soap.Node;

import com.alexbt.algos.util.BstNode;
import com.alexbt.algos.util.Visitor;

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
