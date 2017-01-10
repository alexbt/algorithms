package com.alexbt.algos.tree.redblack;

public class Node {

    public int val;
    public boolean isRed = false;
    public Node left;
    public Node right;

    public Node(int val) {
        this.val = val;
    }

    public Node() {

    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + val;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Node other = (Node) obj;
        if (val != other.val) {
            return false;
        }
        return true;
    }

}
