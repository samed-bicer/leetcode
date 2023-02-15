# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:

        preHead = ListNode(-1, head)
        prev = preHead
        current = head

        while current:
            if current.val == val:
                prev.next = current.next
            else:
                prev = prev.next
            current = current.next

        return preHead.next