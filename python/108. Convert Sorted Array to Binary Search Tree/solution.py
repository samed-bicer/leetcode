# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        def bst(start, end):
            if (start <= end):
                rootIndex = start + (end - start) // 2

                root = TreeNode(nums[rootIndex])
                root.left = bst(start, rootIndex - 1)
                root.right = bst(rootIndex + 1, end)

                return root

        return bst(0, len(nums) - 1)