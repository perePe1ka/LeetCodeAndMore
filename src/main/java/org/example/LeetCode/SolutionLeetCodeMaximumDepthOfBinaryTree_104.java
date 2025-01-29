package org.example.LeetCode;

public class SolutionLeetCodeMaximumDepthOfBinaryTree_104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int a = maxDepth(root.left);
        int b = maxDepth(root.right);

        System.out.println(a);
        System.out.println(b);
        return Math.max(a,b) + 1;
    }

}



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}