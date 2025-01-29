package org.example.LeetCode;

public class SolutionLeetCode_PathSum_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);

        return left || right;
    }
}


//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode(5);
//        treeNode.left = new TreeNode(4);
//        treeNode.right = new TreeNode(8);
//        treeNode.left.left = new TreeNode(11);
//        treeNode.left.left.left = new TreeNode(7);
//        treeNode.left.left.right = new TreeNode(2);
//        treeNode.right.left = new TreeNode(13);
//        treeNode.right.right = new TreeNode(4);
//        treeNode.right.right.right = new TreeNode(1);
//
//        printTree(treeNode);
//
//        Solution solution = new Solution();
//
//        solution.hasPathSum(treeNode, 22);
//    }
//
//    public static void printTree(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//
//        System.out.println(root.val);
//        printTree(root.left);
//        printTree(root.right);
//    }
//}