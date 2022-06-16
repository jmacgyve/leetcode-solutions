package com.jmacgyve.problems.easy.BinaryTreePreorderAndPostorderTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            ans.add(root.val);
            if (root.right != null)
                stack.push(root.right);
            if (root.left != null)
                stack.push(root.left);
        }

        return ans;
    }
}