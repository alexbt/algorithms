package com.alexbt.algos.graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import com.alexbt.algos.util.Assert;
import com.alexbt.algos.util.GraphNode;
import com.alexbt.algos.util.Visitor;

public class DepthFirstSearchIterative {

    public void traversal(GraphNode node) {
        Assert.notNull(node);

        Stack<GraphNode> stack = new Stack<>();
        Set<GraphNode> visited = new HashSet<GraphNode>();

        stack.add(node);

        while (!stack.isEmpty()) {
            node = stack.pop();
            visited.add(node);
            boolean endOfRoad = true;
            for (GraphNode child : node.children) {
                if (!visited.contains(child)) {
                    endOfRoad = false;
                    stack.add(child);
                }
            }
            if (endOfRoad) {
                Visitor.visit(node);
            }
        }
    }

}
