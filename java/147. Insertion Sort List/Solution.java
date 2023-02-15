/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {

        ListNode preHead = new ListNode(0, head);
        ListNode prev = head;
        ListNode current = head.next;

        while(current != null) {
            if (current.val < prev.val) {
                //need to put next current into the correct position
                //remove the current
                prev.next = current.next;

                ListNode preInsert = preHead;
                while (current.val > preInsert.next.val) {
                    preInsert = preInsert.next;
                }

                //we found the place to insert after
                current.next = preInsert.next;
                preInsert.next = current;
                current = prev.next;
            } else {
                //continue with iteration
                prev = current;
                current = current.next;
            }
        }

        return preHead.next;

    }
}