# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def insertionSortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        preHead = ListNode(next=head)
        prev = head
        current = head.next

        while current:
            # find the element which needs to be re-inserted to its correct place
            if current.val < prev.val:
                # we found the element
                # remove the current from the list
                prev.next = current.next

                # find the place to insert current
                preInsert = preHead
                while (current.val > preInsert.next.val):
                    # find the element just befofe where we need to insert
                    preInsert = preInsert.next
                    # we found the element which will point to our node in correct order

                # place current between preInsert and preInsert.next
                current.next = preInsert.next
                preInsert.next = current
                # go into the next element in list
                current = prev.next
            else:
                # continue with iterating
                prev = current
                current = current.next

        return preHead.next