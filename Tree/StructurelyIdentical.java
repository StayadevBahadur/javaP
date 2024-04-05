package Tree;

public class StructurelyIdentical {
    import java.util.*;

// Define the TreeNode class for the tree structure
class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class StructurallyIdenticalTrees<T> {
    public boolean areStructurallyIdentical(TreeNode<T> root1, TreeNode<T> root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.children.size() != root2.children.size()) {
            return false;
        }

        for (int i = 0; i < root1.children.size(); i++) {
            if (!areStructurallyIdentical(root1.children.get(i), root2.children.get(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode<Integer> root1 = new TreeNode<>(1);
        root1.children.add(new TreeNode<>(2));
        root1.children.add(new TreeNode<>(3));
        root1.children.get(0).children.add(new TreeNode<>(4));

        TreeNode<Integer> root2 = new TreeNode<>(1);
        root2.children.add(new TreeNode<>(2));
        root2.children.add(new TreeNode<>(3));
        root2.children.get(0).children.add(new TreeNode<>(4));

        StructurallyIdenticalTrees<Integer> checker = new StructurallyIdenticalTrees<>();
        boolean result = checker.areStructurallyIdentical(root1, root2);
        System.out.println("Are the trees structurally identical? " + result);
    }
}

}
