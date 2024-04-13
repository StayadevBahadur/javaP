package BinaryTrees;

public class CheckIsBst {
    /* in BST root.left data should be smaller then root data and root.right data should be greater than root data */
    public static int minmum(BinaryTree<Integer> root){
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(minmum(root.left),minmum(root.right)));
    }
    public static int maximum(BinaryTree<Integer> root){
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
    }
    public static boolean isBst(BinaryTree<Integer> root){
        if (root == null) {
            return true;
        }

        int min = minmum(root.right);
        int max = maximum(root.left);

        if (root.data <= min) {
            return false;
        }
        if (root.data > max) {
            return false;
        }

        boolean isLeft = isBst(root.left);
        boolean isRight = isBst(root.right);

        if ( isLeft && isRight) {
            return true;
        }else{
            return false;
        }
    }
}
