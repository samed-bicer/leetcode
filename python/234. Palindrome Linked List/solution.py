# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        current = head
        middleCurrent = self.reverseLinkedList(slow)

        while middleCurrent:
            if current.val != middleCurrent.val:
                return False
            current = current.next
            middleCurrent = middleCurrent.next


        return True


    def reverseLinkedList(self, head):

        prev = None
        current = head

        while current:
            temp = current.next
            current.next = prev
            prev = current
            current = temp

        return prev