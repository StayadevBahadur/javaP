package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ChecktheNum {
    public static TreeUsingArray<Integer> takeILW(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the root data");
        int rootData = s.nextInt();
        TreeUsingArray<Integer> Nextroot = new TreeUsingArray<Integer>(rootData);
        Queue<TreeUsingArray<Integer>> penddingNdes = new LinkedList<>();
        penddingNdes.add(Nextroot);
        while (!penddingNdes.isEmpty()) {
            TreeUsingArray<Integer> frontN = penddingNdes.poll();
            System.out.print("Enter number child of  "+frontN);
            int NumChild = s.nextInt();
            for(int i = 0; i<NumChild;i++){
                System.out.print("Enter the " + (i+1)+"child of " + frontN.data);
                int child = s.nextInt();
                frontN.children.add(child);
                penddingNdes.add(child);
            }
        }
        return Nextroot;
    }
    public static void main(String[] args) {
        TreeUsingArray<Integer> root = takeILW();
        System.out.print("Hi is it working")
    }
}
