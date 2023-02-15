/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    /* ITERATIVE */

    public int maxDepth(TreeNode root) {
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        var current = new Pair<>(root, 1);
        stack.push(current);
        int maxDepth = 0;

        while (!stack.isEmpty()) {
            current = stack.pop();
            if (current.getKey() != null) {
                maxDepth = Math.max(maxDepth, current.getValue());
                stack.push(new Pair<>(current.getKey().left, current.getValue() + 1));
                stack.push(new Pair<>(current.getKey().right, current.getValue() + 1));
            }
        }
        return maxDepth;
    }

    /* RECURSIVE */
    public int maxDepth(TreeNode root) {
        return calculateDepth(root, 0);

    }

    public int calculateDepth(TreeNode root, int depth) {
        if (root == null) return depth;
        return Math.max(calculateDepth(root.left, depth + 1), calculateDepth(root.right, depth + 1));
    }
}