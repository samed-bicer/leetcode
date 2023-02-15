# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:

        def rec(root, visited):
            if not root:
                return
            rec(root.left, visited)
            visited.append(root.val)
            rec(root.right, visited)

        visited = []
        rec(root, visited)

        return visited