# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        self.total = 0
        def dfs(node, current):
            if not node:
                return

            current = current * 10 + node.val

            if not node.left and not node.right:
                self.total += current
                return

            dfs(node.left, current)
            dfs(node.right, current)

        dfs(root, 0)
        return self.total
     