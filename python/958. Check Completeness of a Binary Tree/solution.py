# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isCompleteTree(self, root: Optional[TreeNode]) -> bool:

        queue = deque([root])
        nullFound = False

        while len(queue) > 0:
            node = queue.popleft()

            if node == None:
                nullFound = True
                continue

            if nullFound:
                return False

            queue.append(node.left)
            queue.append(node.right)

        return True
    