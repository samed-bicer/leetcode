/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode current = head;

        while(current != null) {
            if (visited.contains(current)) {
                return current;
            }
            visited.add(current);
            current = current.next;
        }

        return null;
    }
/******************************************************************
 ******************************************************************/
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;

        ListNode intersect = getIntersect(head);
        if (intersect == null) return null;

        ListNode current = head;

        while (intersect != current) {
            intersect = intersect.next;
            current = current.next;
        }

        return current;

    }

    public ListNode getIntersect(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) return fast;
        }

        return null;
    }
}