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
    int total = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return total;
    }

    public void dfs(TreeNode node, int current) {
        if (node == null) return;

        current = current * 10 + node.val;
        //if leaf node, add into the total
        if (node.left == null && node.right == null) {
            total += current;
            return;
        }

        dfs(node.left, current);
        dfs(node.right, current);
    }

}