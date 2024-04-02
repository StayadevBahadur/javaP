package Tree;

import java.util.Scanner;

public class TreeUse<T> {
    public static TreeUsingArray<Integer> takeInput(Scanner s){
        int n ;
      
        System.out.print("Enter next node data ");
        n = s.nextInt();
        TreeUsingArray<Integer> root = new TreeUsingArray<Integer>(n);
        System.out.println("Enter number of Children for "+ n);
        int numChild = s.nextInt();
        for(int i = 0 ; i<numChild ; i++){
            TreeUsingArray<Integer> subRoot = takeInput(s);
            root.children.add(subRoot);
        }
        return root; 
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
        // TreeUsingArray<Integer> root = new TreeUsingArray<Integer>(4);
        // TreeUsingArray<Integer> node1 = new TreeUsingArray<Integer>(2);
        // TreeUsingArray<Integer> node2 = new TreeUsingArray<Integer>(3);
        // TreeUsingArray<Integer> node3 = new TreeUsingArray<Integer>(5);
        // TreeUsingArray<Integer> node4 = new TreeUsingArray<Integer>(6);

        // root.children.add(node1);
        // root.children.add(node2);
        // root.children.add(node3);
        // node2.children.add(node4);
        Scanner s = new Scanner(System.in);
        TreeUsingArray<Integer> root = takeInput(s);
        print(root);
    }
}
