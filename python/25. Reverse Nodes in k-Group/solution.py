# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:

        # assume at least k items exist in the given linkedlist
        def reverse(head, k):
            prev = None
            current = head

            while k > 0:
                next = current.next
                current.next = prev
                prev = current
                current = next
                k -= 1

            return prev

        count = 0
        current = head

        # go k step forward
        while count < k and current:
            current = current.next
            count += 1

        if count == k:
            # we need to reverse k nodes
            newHead = reverse(head, k)
            # here head given to the reverse function will be
            # the tail of the reversed part of the linked list
            # we need to connect it with the next batch
            head.next = self.reverseKGroup(current, k)
            return newHead

        else:
            # we dont have enough node, return head without reversing
            return head
