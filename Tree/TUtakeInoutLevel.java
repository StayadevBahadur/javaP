package Tree;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class TUtakeInoutLevel {
    public static TreeUsingArray<Integer> takeILevelwise(){
      Scanner s = new Scanner(System.in);
      System.out.print("Enter root data : ");
      int rootData = s.nextInt();
      Queue<TreeUsingArray<Integer>> penddingNodes = new LinkedList<>();
      TreeUsingArray<Integer> rootTobeAdded = new TreeUsingArray<Integer>(rootData);
      penddingNodes.add(rootTobeAdded);
      while (!penddingNodes.isEmpty()) {
        TreeUsingArray<Integer> frontNode = penddingNodes.poll();
        System.out.print("Enter number of children of " + frontNode.data + ": ");
        int numChild = s.nextInt();
        for(int i = 0 ; i<numChild;i++){
            System.out.print("Enter "+ (i+1) +" child of 4"+frontNode.data + ": ");
            int child = s.nextInt();
            TreeUsingArray<Integer> chidNode = new TreeUsingArray<Integer>(child);
            frontNode.children.add(chidNode);
            penddingNodes.add(chidNode);
        }
      }
    return rootTobeAdded;      
    }
    
    public static void print(TreeUsingArray<Integer> root ){
        String s  = root.data + ":";
        for(int i = 0 ; i<root.children.size();i++){
            s = s+root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i = 0 ; i<root.children.size();i++){
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeUsingArray<Integer> root = takeILevelwise();
        print(root);
    }
}
