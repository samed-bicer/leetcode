# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:

        def mergeTwoLists(left, right):
            preHead = ListNode()
            current = preHead

            while left and right:
                if left.val < right.val:
                    current.next = left
                    left = left.next
                else:
                    current.next = right
                    right = right.next
                current = current.next

            if not left:
                current.next = right
            if not right:
                current.next = left

            return preHead.next


        if not lists:
            return None
        if len(lists) == 1:
            return lists[0]

        while len(lists) > 1:
            lists.append(mergeTwoLists(lists.pop(), lists.pop()))

        return lists[0]