package com.alexbt.algos.tree;

public class RecursiveTraversal {
    
    public void inorder(Node node){
        if(node==null){
            return;
        }
        
        recursiveInorder(node.left);
        visit(node);
        recursiveInorder(node.right);
    }
    
    public void preorder(Node node){
        if(node==null){
            return;
        }
        
        visit(node);
        recursiveInorder(node.left);
        recursiveInorder(node.right);
    }
    
    public void postorder(Node node){
        if(node==null){
            return;
        }
        
        recursiveInorder(node.left);
        recursiveInorder(node.right);
        visit(node);
    }

}
