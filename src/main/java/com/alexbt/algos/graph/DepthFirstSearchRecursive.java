package com.alexbt.algos.graph;

import java.util.Set;

import com.alexbt.algos.util.Assert;
import com.alexbt.algos.util.GraphNode;
import com.alexbt.algos.util.Visitor;

public class DepthFirstSearchRecursive {

    public void traversal(GraphNode node, Set<GraphNode> visited) {
        Assert.notNull(node);
        visited.add(node);

        boolean endOfRoad = true;
        for (GraphNode child : node.children) {
            if (!visited.contains(child)) {
                endOfRoad = false;
                traversal(child, visited);
            }
        }

        if (endOfRoad) {
            Visitor.visit(node);
        }
    }

}
