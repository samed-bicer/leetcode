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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode current = head;
        ListNode evenHead = head.next;
        ListNode odd = new ListNode();
        ListNode even = new ListNode();


        int i = 1;

        while (current != null) {
            if (i % 2 == 1) {
                //odd
                odd.next = current;
                odd = current;
            } else {
                //even
                even.next = current;
                even = current;
            }
            current = current.next;
            i++;
        }

        odd.next = evenHead;
        even.next = null;

        return head;
    }
}