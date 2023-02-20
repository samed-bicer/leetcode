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
    public ListNode reverseKGroup(ListNode head, int k) {
        return reverseKGroup(head, k, countNodes(head));
    }

    public ListNode reverseKGroup(ListNode head, int k, int remaining) {
        if (remaining < k) return head;
        ListNode tail = kthNode(head, k - 1);
        ListNode p = tail.next;
        tail.next = null;
        ListNode nextHead = reverseKGroup(p, k, remaining - k);
        ListNode currentHead = reverse(head);
        head.next = nextHead;
        return currentHead;
    }


    public int countNodes(ListNode head) {
        if (head == null) return 0;
        ListNode current = head;
        int count = 1;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public ListNode kthNode(ListNode head, int k) {
        ListNode current = head;
        for (int i = 0; i < k; i++) {
            current = current.next;
        }
        return current;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode p = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}