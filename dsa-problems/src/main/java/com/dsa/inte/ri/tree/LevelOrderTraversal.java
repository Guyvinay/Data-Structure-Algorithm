package com.dsa.inte.ri.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(7);
        root.right = new TreeNode(0);

        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);

        root.right.right = new TreeNode(9);

        levelOrderTraversal(root);
    }

    private static void levelOrderTraversal(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();
            System.out.println(node.val);

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }
}
