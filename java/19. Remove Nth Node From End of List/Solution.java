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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode preHead = new ListNode(-1, head);

        ListNode current = head;
        int count = 0;

        while (current != null) {
            current = current.next;
            count++;
        }

        int turn = count - n;
        ListNode prev = preHead;
        current = head;

        for (int i = 0; i < turn; i++) {
            prev = prev.next;
            current = current.next;
        }

        prev.next = current.next;

        return preHead.next;

    }
}