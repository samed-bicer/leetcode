# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    prev = None
    minDiff = math.inf

    def minDiffInBST(self, root: Optional[TreeNode]) -> int:
        self.inOrder(root)
        return self.minDiff

    def inOrder(self, node):
        if not node:
            return

        self.inOrder(node.left)

        if self.prev != None:
            self.minDiff = min(self.minDiff, node.val - self.prev.val)
        self.prev = node

        self.inOrder(node.right)