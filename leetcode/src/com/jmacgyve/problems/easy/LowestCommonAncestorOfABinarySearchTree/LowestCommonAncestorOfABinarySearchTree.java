package com.jmacgyve.problems.easy.LowestCommonAncestorOfABinarySearchTree;

public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr_node = root;

        if (curr_node.val > p.val && curr_node.val < q.val) {
            return curr_node;
        } else if (curr_node.val > p.val && curr_node.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (curr_node.val < p.val && curr_node.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
