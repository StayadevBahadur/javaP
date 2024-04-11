package BinaryTrees;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class CheckIsBalenced {
    public static BinaryTree<Integer> CreateLLTree(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the root data : ");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTree<Integer> ToAdd = new BinaryTree<Integer>(rootData);
        Queue<BinaryTree<Integer>> pennDingNodes = new LinkedList<>();
        pennDingNodes.add(ToAdd);
        
        while (!pennDingNodes.isEmpty()) {
            BinaryTree<Integer> fN = pennDingNodes.poll();
            System.out.print("Enter the left child of  "+fN.data);
            int fChid = s.nextInt();
            if (fChid != -1) {
                BinaryTree<Integer> leftChild = new BinaryTree<Integer>(fChid);
                fN.left = leftChild;
                pennDingNodes.add(leftChild);
            }
                  
            System.out.print("Enter the right child of  "+fN.data);
            int rChid = s.nextInt();
            if (fChid != -1) {
                BinaryTree<Integer> rightChild = new BinaryTree<Integer>(rChid);
                fN.right = rightChild;
                pennDingNodes.add(rightChild);
            }
           
        }
        return ToAdd;
    }

    public static void PLW(BinaryTree<Integer> root){
        if (root == null) {
            return ;
        }

        Queue<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTree<Integer> Fnode = queue.poll();
            System.out.print(Fnode.data);
            if (Fnode.left != null) {
                System.out.print(":L"+ Fnode.left.data);
                queue.add(Fnode.left);
            }else{
                System.out.print("L:-1");
            }
            
            if (Fnode.right != null) {
                queue.add(Fnode.right);
                System.out.print(",R:"+ Fnode.right.data);
            }else{
                System.out.print(",R-1");
            }     
            
            System.out.println();
        }
         
    }

    public static int getHeight(BinaryTree<Integer> root){
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return 1 + Math.max(leftHeight, rightHeight) ;
    }

    public static boolean isBalenced(BinaryTree<Integer> root){
        // A balanced tree is if the height of left sub tree - height of right sub tree is <=1  
        if (root == null) {
            return false;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (Math.abs(leftHeight-rightHeight)>1) {
            return false;
        }
        
        boolean isLeftBalenced = isBalenced(root.left);
        boolean isRightBalenced = isBalenced(root.right);

        return isLeftBalenced && isRightBalenced;
    }

    public static void main(String[] args) {
        BinaryTree<Integer> root = CreateLLTree();
        PLW(root);
        System.out.println(isBalenced(root));
    }
}
