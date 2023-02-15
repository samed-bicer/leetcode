# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:

        carry = 0
        preHead = ListNode()
        current = preHead

        while l1 != None or l2 != None or carry != 0:
            sum = (l1.val if l1 != None else 0) + (l2.val if l2 != None else 0) + carry
            current.next = ListNode(sum % 10)
            carry = sum // 10

            l1 = l1.next if l1 != None else l1
            l2 = l2.next if l2 != None else l2
            current = current.next

        return preHead.next
