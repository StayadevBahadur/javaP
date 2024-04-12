package BinaryTrees;

public class DaimeterOfBT {
    public static int daimeter(BinaryTree<Integer> root){
        /*In a binary tree, the diameter refers to the longest path between any two nodes in the tree. This path may or may not pass through the root node. The length of the path is measured by counting the number of edges (or nodes, depending on the convention) along the path. */
        if (root == null ) {
            return 0 ;
        }
        int option1 = getHeight(root.left)+getHeight(root.right);
        int option2 = getHeight(root.left);
        int option3 = getHeight(root.right);

        return 1+ Math.max(Math.max(option1, option2), option3);
    }
    public static int getHeight(BinaryTree<Integer> root){
        if (root == null) {
            return 0;
        }
      int leftHeight =   getHeight(root.left);
       int rightHeight =  getHeight(root.right);
       return 1 + Math.max(leftHeight, rightHeight);
    }
}
