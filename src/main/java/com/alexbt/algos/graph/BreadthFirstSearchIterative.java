package com.alexbt.algos.graph;

import com.alexbt.algos.util.Assert;
import com.alexbt.algos.util.GraphNode;
import com.alexbt.algos.util.Visitor;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchIterative {

    public void traversal(GraphNode node) {
        Assert.notNull(node);

        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode current = queue.remove();
            Visitor.visit(node);
            for (GraphNode child : current.children) {
                queue.add(child);
            }
        }
    }

}
