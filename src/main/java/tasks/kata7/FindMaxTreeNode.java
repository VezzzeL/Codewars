package tasks.kata7;
//You are given a binary tree. Implement the method findMax which returns the maximal node value in the tree.
//For example, maximum in the following Tree is 11.
//Note:
//Tree node values any integer value.
//Tree can unbalanced and unsorted.
//The root argument is never an empty tree.
public class FindMaxTreeNode {
    class TreeNode {
        TreeNode  left;
        TreeNode  right;
        int value;
    }
    static int findMax(TreeNode  root) {
        int max = Integer.MIN_VALUE;
        if (root == null) return max;
        max = Math.max(max, Math.max(findMax(root.left), findMax(root.right)));
        max = Math.max(max, root.value);
        return max;
    }
}
