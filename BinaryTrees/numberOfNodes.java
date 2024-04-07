package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class numberOfNodes {
    public static BinaryTree<Integer> TalkeInLwise(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the root data");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
        Queue<BinaryTree<Integer>> penddinNodes = new LinkedList<>();
        penddinNodes.add(root);
        while (!penddinNodes.isEmpty()) {
            BinaryTree<Integer> frontNode = penddinNodes.poll();
            System.out.print("Enter the left child of " +  frontNode.data);
            int leftChild = s.nextInt();
            if (leftChild != -1) {
                BinaryTree<Integer> lChild = new BinaryTree<Integer>(leftChild);
                penddinNodes.add(lChild);
                frontNode.left = lChild;
            }
            System.out.print("Enter the right child of " +  frontNode.data);
            int rightChild = s.nextInt();
            if (rightChild != -1) {
                BinaryTree<Integer> RChild = new BinaryTree<Integer>(rightChild);
                penddinNodes.add(RChild);
                frontNode.right = RChild;
            }
                  
        }
        return root;
    }

    public static void Print(BinaryTree<Integer> root){
        if (root == null ) {
            return;
        }
        String toBePrinted = root.data + "";
        if (root.left != null) {
            toBePrinted += "L"+root.left.data+ ",";
        }
        if (root.right != null) {
            toBePrinted += "R"+root.right.data+ ",";
        }
        System.out.println(toBePrinted);
        Print(root.left);
        Print(root.right);
    }

    public static int CountNumNode(BinaryTree<Integer> root){
        if (root == null) {
            return 0;
        }
        int ans = 1;
        ans+= CountNumNode(root.left);
        ans += CountNumNode(root.right);

        return ans;
    }

    public static int getSum(BinaryTree<Integer> root){
   
        if (root == null) {
            return 0; // If the root is null, the sum is 0
        }
        
        int leftSum = getSum(root.left); // Sum of nodes in the left subtree
        int rightSum = getSum(root.right); // Sum of nodes in the right subtree
        
        return root.data + leftSum + rightSum; // Total sum is the sum of current node + left subtree sum + right subtree sum
    }

    public static boolean isNodePresent(BinaryTree<Integer> root, int x) {
      
            if (root == null) {
                return false;
            }
            if (root.data != x) {
                return false;
            }
            isNodePresent(root.left, x);
            isNodePresent(root.right, x);

            return true;
        }
    public static void main(String[] args) {
        BinaryTree<Integer> root = TalkeInLwise();
        Print(root);
        System.out.println(CountNumNode(root));
    }
}
