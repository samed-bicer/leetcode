# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sortedListToBST(self, head: Optional[ListNode]) -> Optional[TreeNode]:
        def findMiddle(head):
            if not head:
                return None

            prev = None
            slow = head
            fast = head

            while fast and fast.next:
                prev = slow
                slow = slow.next
                fast = fast.next.next

            if prev:
                prev.next = None

            return slow


        if not head:
            return None

        middle = findMiddle(head)
        node = TreeNode(middle.val)

        if head == middle:
            return node

        node.left = self.sortedListToBST(head)
        node.right = self.sortedListToBST(middle.next)

        return node
    