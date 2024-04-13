package BinaryTrees;

public class IsBst2 {
    public static Pair<Boolean,Pair<Integer,Integer>> isBST(BinaryTree<Integer> root){
        if (root == null) {
            Pair<Boolean,Pair<Integer,Integer>> output = new Pair<>();
            output.first = true;
            output.second = new Pair<>();
            output.second.first = Integer.MIN_VALUE;
            output.second.second = Integer.MAX_VALUE;
            return output;
        }

        Pair<Boolean,Pair<Integer,Integer>> leftoutput = isBST(root.left);
        Pair<Boolean,Pair<Integer,Integer>> rightoutput = isBST(root.right);

        int min = Math.min(root.data,Math.min(leftoutput.second.first, rightoutput.second.first));
        int max = Math.max(root.data,Math.max(leftoutput.second.second, rightoutput.second.second));

        boolean isBST = (root.data > leftoutput.second.second) && (root.data < rightoutput.second.first) && leftoutput.first && rightoutput.first;

        Pair<Boolean,Pair<Integer,Integer>> output = new Pair<>();
            output.first = isBST;
            output.second = new Pair<>();
            output.second.first = min;
            output.second.second = max;
            return output;
    }
}
