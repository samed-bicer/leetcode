# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        preHead = ListNode(next = head)

        fast = preHead
        slow = preHead
        for i in range(n + 1):
            fast = fast.next

        while fast :
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next

        return preHead.next
     