package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.tree.TreeNode;


public class SumOfNodes {

    public static TreeUsingArray<Integer> TakeInputLevewise(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the root data");
        int rootData = s.nextInt();
        Queue<TreeUsingArray<Integer>> pendingNodes = new LinkedList<>();
        TreeUsingArray<Integer> nextRoot = new TreeUsingArray<Integer>(rootData);
        pendingNodes.add(nextRoot);
        while (!pendingNodes.isEmpty()) {
            TreeUsingArray<Integer> frontNode = pendingNodes.poll();
            System.out.print("Enter number of children of " + frontNode.data);
            int numberOfChild = s.nextInt();
            for(int i = 0 ; i<numberOfChild;i++){
                System.out.print("Enter the "+(i+1)+"Child of"+frontNode.data);
                int Child = s.nextInt();
                TreeUsingArray<Integer> chidNode = new TreeUsingArray<Integer>(Child);
                frontNode.children.add(chidNode);
                pendingNodes.add(chidNode);
            }
        }
        return nextRoot;
    }

    public static void printLevlewise(TreeUsingArray<Integer> root){
        if (root == null) return;

        Queue<TreeUsingArray<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeUsingArray<Integer> node = queue.poll();
                System.out.print(node.data + " ");

                for (TreeUsingArray<Integer> child : node.children) {
                    queue.add(child);
                }
            }
            System.out.println();
        }
    }
    public static int sumOfAllNode(TreeUsingArray<Integer> root){
            int Sum = root.data;
            for(int i = 0 ; i<root.children.size();i++){
                Sum = Sum + sumOfAllNode(root.children.get(i));
            }
            return Sum;
        
        }
    public static int NumberOfNodes(TreeUsingArray<Integer> root){
        if (root == null) {
            return 0;
        }
            int count = 1;
            for(int i = 0 ; i<root.children.size();i++){
                count = count + NumberOfNodes(root.children.get(i));
            }
            return count;
        
        }

    public static int getHeight(TreeUsingArray<Integer> root){
        if (root == null) {
            return -1; // An empty tree has height -1
        }
    
        int maxHeight = 0; // Initialize to -1 to count edges
    
        for (TreeUsingArray<Integer> child : root.children) {
            int childHeight = getHeight(child);
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
    
        return maxHeight + 1; // Height of current node = max height of children + 1
    }
     
	
    
    
    public static void main(String[] args) {
        TreeUsingArray<Integer> root = TakeInputLevewise();
        printLevlewise(root);
       int sum =  sumOfAllNode(root);
       System.out.print(NumberOfNodes(root));
    }
}
