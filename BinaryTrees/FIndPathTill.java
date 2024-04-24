package BinaryTrees;

import java.util.ArrayList;

public class FIndPathTill {
    // Your given a binary tree and a root you need to return a array list of node to reach the given node'
    public static ArrayList<Integer> FindPath(BinaryTree<Integer> root , int node){
        if (root == null) {
            return null;
        }

        if (root.data == node) {
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftOutput = FindPath(root.left, node);
        if (leftOutput != null) {
            leftOutput.add(root.data);
            return leftOutput;  
        }

        ArrayList<Integer> rightOutput = FindPath(root.right, node);
        if (rightOutput != null) {
            rightOutput.add(root.data);
            return rightOutput;
        }else{
            return null;
        }

    }     

}
