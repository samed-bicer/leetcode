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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> visited = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            visited.add(current.val);
            current = current.right;
        }

        return visited;
    }


    /* RECURSIVE */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> visited = new ArrayList<>();
        rec(root, visited);
        return visited;
    }

    public void rec(TreeNode root, List<Integer> visited) {
        if (root == null) return;
        rec(root.left, visited);
        visited.add(root.val);
        rec(root.right, visited);
    }
}