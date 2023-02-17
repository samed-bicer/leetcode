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

    int minDifference = Integer.MAX_VALUE;
    TreeNode prev;

    public int minDiffInBST(TreeNode root) {
        inOrderTraversal(root);
        return minDifference;

    }

    public void inOrderTraversal(TreeNode node) {
        if (node == null) return;

        inOrderTraversal(node.left);

        if(prev != null)
            minDifference = Math.min(minDifference, node.val - prev.val);
        prev = node;

        inOrderTraversal(node.right);
    }

    //////////////////////////////////////////////////////////////
    public int minDiffInBST(TreeNode root) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            minHeap.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

    int minDifference = Integer.MAX_VALUE;
        int prev = minHeap.poll();

        while(!minHeap.isEmpty()) {
            int current = minHeap.poll();
            minDifference = Math.min(minDifference, current - prev);
            prev = current;
        }

    return minDifference;
    }
}