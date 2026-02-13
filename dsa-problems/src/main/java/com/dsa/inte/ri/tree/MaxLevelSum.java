package com.dsa.inte.ri.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(7);
        root.right = new TreeNode(0);

        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);

        root.right.right = new TreeNode(9);

        System.out.println(maxLevelSum(root));

    }

    private static int maxLevelSum(TreeNode root) {

        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxSum = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            int n = queue.size();
            int levelSum = 0;
            for (int i=0; i<n; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);

                if (levelSum > maxSum) {
                    maxSum = levelSum;
                }
            }
        }
        return maxSum;
    }
}
