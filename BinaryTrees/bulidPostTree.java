package BinaryTrees;

public class bulidPostTree {
  

        public static BinaryTree<Integer> buildTree(int[] preOrder, int[] inOrder) {
            return buildTreeHelper(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length - 1);
        }
    
        private static BinaryTree<Integer> buildTreeHelper(int[] preOrder, int[] inOrder, int preStart, int preEnd, int inStart, int inEnd) {
            if (preStart > preEnd || inStart > inEnd) {
                return null;
            }
    
            // The first element in preorder traversal is the root
            int rootValue = preOrder[preStart];
            BinaryTree<Integer> root = new BinaryTree<>(rootValue);
    
            // Find the index of the root in inorder traversal
            int rootIndexInorder = 0;
            for (int i = inStart; i <= inEnd; i++) {
                if (inOrder[i] == rootValue) {
                    rootIndexInorder = i;
                    break;
                }
            }
    
            // Calculate sizes of left and right subtrees
            int leftSubtreeSize = rootIndexInorder - inStart;
            int rightSubtreeSize = inEnd - rootIndexInorder;
    
            // Recursively build left and right subtrees
            root.left = buildTreeHelper(preOrder, inOrder, preStart + 1, preStart + leftSubtreeSize, inStart, rootIndexInorder - 1);
            root.right = buildTreeHelper(preOrder, inOrder, preStart + leftSubtreeSize + 1, preEnd, rootIndexInorder + 1, inEnd);
    
            return root;
        }
    
        // BinaryTree class definition here...
    
        public static void main(String[] args) {
            int[] preOrder = { 1, 2, 4, 5, 3, 6, 7 };
            int[] inOrder = { 4, 2, 5, 1, 6, 3, 7 };
            BinaryTree<Integer> root = buildTree(preOrder, inOrder);
            
        }
    
    
}
