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

    int[] nums;
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;

        return bst(0, nums.length - 1);

    }


    public TreeNode bst (int start, int end) {
        //base
        if (start <= end) {
            int rootIndex = start + (end - start) / 2;
            TreeNode root = new TreeNode(nums[rootIndex]);

            root.left = bst(start, rootIndex - 1);
            root.right = bst(rootIndex + 1, end);

            return root;
        }
        return null;
    }
}