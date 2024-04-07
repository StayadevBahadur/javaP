package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import LinkList.LinkListUse;

public class BinaryTreeUse {
    // public static BinaryTree<Integer> TaKeI(Scanner s){
    //     int rootData ;
    //     System.out.println("Enter the root data");
    //     rootData = s.nextInt();
    //     if (rootData == -1) {
    //         return null;
    //     }
    //     BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
    //     root.left = TaKeI(s);
    //     root.left = TaKeI(s);

    //     return root;
    // }

    public static BinaryTree<Integer> TakeILwise(){
        Scanner s = new Scanner(System.in);
        Queue<BinaryTree<Integer>> peddingNodes = new LinkedList<>();
        System.out.print("Enter the root data : ");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
        peddingNodes.add(root);
        while (!peddingNodes.isEmpty()) {
            BinaryTree<Integer> frontNode = peddingNodes.poll();
            System.out.print("Enter the left child of "+ frontNode.data + ": ");
            int leftChild = s.nextInt();
            if (leftChild != -1) {
                BinaryTree<Integer> child = new BinaryTree<Integer>(leftChild);
                peddingNodes.add(child);
                frontNode.left = child;
            }
            System.out.print("Enter the right child of "+ frontNode.data+ ": ");
            int rightChild = s.nextInt();
            if (rightChild != -1) {
                BinaryTree<Integer> rchild = new BinaryTree<Integer>(rightChild);
                peddingNodes.add(rchild);
                frontNode.right = rchild;
            }

        }
        return root;
    }

    public static void Print(BinaryTree<Integer> root){
        if (root == null) {
           return; 
        }
        String toBePrinted = root.data + ":";
        if (root.left != null) {
            toBePrinted += "L"+root.left.data + ",";
        }
        if (root.right != null) {
            toBePrinted += "R"+root.right.data ;
        }
        System.out.println(toBePrinted);
        Print(root.left);
        Print(root.right);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTree<Integer> root = TakeILwise();
        Print(root);
    }
}
