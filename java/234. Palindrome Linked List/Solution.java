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
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode current = head;
        ListNode middle = head;

        while (current != null && current.next != null) {
            middle = middle.next;
            current = current.next.next;
        }

        current = head;
        ListNode midCurrent = reverseLinkedList(middle);

        while(midCurrent != null) {
            if (current.val != midCurrent.val) return false;
            current = current.next;
            midCurrent = midCurrent.next;
        }
        return true;
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }

        return prev;

    }
}