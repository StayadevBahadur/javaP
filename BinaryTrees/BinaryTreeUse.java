package BinaryTrees;

import java.util.Scanner;

public class BinaryTreeUse {
    public static BinaryTree<Integer> TaKeI(Scanner s){
        int rootData ;
        System.out.println("Enter the root data");
        rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
        root.left = TaKeI(s);
        root.left = TaKeI(s);

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
        BinaryTree<Integer> root = TaKeI(s);
        Print(root);
    }
}
