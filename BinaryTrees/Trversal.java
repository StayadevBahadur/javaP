package BinaryTrees;

import java.util.*;

public class Trversal {
    public static BinaryTree<Integer> TalkeInLwise(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the root data :");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        Queue <BinaryTree<Integer>> penddinNodes = new LinkedList<>();
        BinaryTree<Integer> toBeadded = new BinaryTree<Integer>(rootData);
        penddinNodes.add(toBeadded);
        while (!penddinNodes.isEmpty()) {
            BinaryTree<Integer> fNode = penddinNodes.poll();
            System.out.print("Enter the left chid of " + fNode.data);
            int leftChild = s.nextInt();
            if (leftChild != -1) {
                BinaryTree<Integer> child = new BinaryTree<Integer>(leftChild);
                penddinNodes.add(child);
                fNode.left = child;
            }
            System.out.print("Enter the right chid of " + fNode.data);
            int rightChild = s.nextInt();
            if (rightChild != -1) {
                BinaryTree<Integer> child = new BinaryTree<Integer>(rightChild);
                penddinNodes.add(child);
                fNode.right = child;
            }
        }
        return toBeadded;
    }

    public static void PrintLwise(BinaryTree<Integer> root ){
        if (root == null) {
            return;
        }

        Queue<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTree<Integer> node = queue.poll();
            // Print node information in the specified format
            System.out.print(node.data + ":L:");
            if (node.left != null) {
                System.out.print(node.left.data);
                queue.add(node.left);
            } else {
                System.out.print("-1");
            }
            System.out.print(",R:");
            if (node.right != null) {
                System.out.print(node.right.data);
                queue.add(node.right);
            } else {
                System.out.print("-1");
            }
            System.out.println();
        }
        
    }  

    public static void inOrderPrint(BinaryTree<Integer> root){
        if (root == null) {
            return;
        }
        inOrderPrint(root.left);
        System.out.print(root.data + " ");
        inOrderPrint(root.right);
    }

    public static void main(String[] args) {
        BinaryTree<Integer> root = TalkeInLwise();
        PrintLwise(root);
        System.out.println();
        inOrderPrint(root);
    }
}
