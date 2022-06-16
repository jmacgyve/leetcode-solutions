package com.jmacgyve.problems.easy.TwoSumIVInputIsABST;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIVInputIsABST {
    Set set = new HashSet<Integer>();

    public boolean findTarget(TreeNode root, int k) {
        return helper(root, k);
    }

    private boolean helper(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return helper(root.left, k) || helper(root.right, k);
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