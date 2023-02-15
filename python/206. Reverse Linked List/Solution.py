# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        current = head
        prev = None

        while current is not None:
            temp = current.next
            current.next = prev
            prev = current
            current = temp

        return prev

# recursive

    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head


        node = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return node