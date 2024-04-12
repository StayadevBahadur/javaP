package BinaryTrees;
import java.util.*;

public class PrintNodesFormAnodeAtKdis {

    public static void nodesAtDistanceK(BinaryTree<Integer> root, int node, int k) {
        BinaryTree<Integer> target = findTargetNode(root, node);
        if (target == null) {
            System.out.println("Target node not found.");
            return;
        }
        List<Integer> nodesAtDistanceK = findNodesAtDistanceK(root, target, k);
        for (int element : nodesAtDistanceK) {
            System.out.println(element);
        }
    }

    private static BinaryTree<Integer> findTargetNode(BinaryTree<Integer> root, int node) {
        if (root == null) {
            return null;
        }

        if (root.data == node) {
            return root;
        }

        BinaryTree<Integer> left = findTargetNode(root.left, node);
        BinaryTree<Integer> right = findTargetNode(root.right, node);

        return left != null ? left : right;
    }

    public static List<Integer> findNodesAtDistanceK(BinaryTree<Integer> root, BinaryTree<Integer> target, int k) {
        List<Integer> result = new ArrayList<>();
        findNodesAtDistanceKHelper(root, target, k, result);
        return result;
    }

    private static int findNodesAtDistanceKHelper(BinaryTree<Integer> node, BinaryTree<Integer> target, int k, List<Integer> result) {
        if (node == null) {
            return -1;
        }

        if (node == target) {
            collectNodesAtDistanceK(node, k, result);
            return 0;
        }

        int leftDist = findNodesAtDistanceKHelper(node.left, target, k, result);
        int rightDist = findNodesAtDistanceKHelper(node.right, target, k, result);

        if (leftDist >= 0) {
            if (leftDist + 1 == k) {
                result.add(node.data);
            } else {
                collectNodesAtDistanceK(node.right, k - leftDist - 2, result);
            }
            return leftDist + 1;
        }

        if (rightDist >= 0) {
            if (rightDist + 1 == k) {
                result.add(node.data);
            } else {
                collectNodesAtDistanceK(node.left, k - rightDist - 2, result);
            }
            return rightDist + 1;
        }

        return -1;
    }

    private static void collectNodesAtDistanceK(BinaryTree<Integer> node, int k, List<Integer> result) {
        if (node == null || k < 0) {
            return;
        }
        if (k == 0) {
            result.add(node.data);
            return;
        }

        collectNodesAtDistanceK(node.left, k - 1, result);
        collectNodesAtDistanceK(node.right, k - 1, result);
    }

    public static void main(String[] args) {
        // Example usage
        BinaryTree<Integer> root = new BinaryTree<>(1);
        root.left = new BinaryTree<>(2);
        root.right = new BinaryTree<>(3);
        root.left.left = new BinaryTree<>(4);
        root.left.right = new BinaryTree<>(5);
        root.right.left = new BinaryTree<>(6);
        root.right.right = new BinaryTree<>(7);

        int targetValue = 2;
        int k = 2;
        nodesAtDistanceK(root, targetValue, k);
    }
}
