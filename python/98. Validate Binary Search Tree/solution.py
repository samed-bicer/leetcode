# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:

        def helper(root, minValue, maxValue):
            if not root:
                return True

            if minValue != None and root.val <= minValue:
                return False

            if maxValue != None and root.val >= maxValue:
                return False

            return helper(root.left, minValue, root.val) and helper(root.right, root.val, maxValue)

        return helper(root, None, None)
