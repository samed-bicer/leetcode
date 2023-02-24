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

    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode list : lists) {
            if (list != null) heap.add(list);
        }

        ListNode preHead = new ListNode();
        ListNode current = preHead;
        while (!heap.isEmpty()) {
            ListNode node = heap.poll();
            if (node.next != null) heap.add(node.next);
            node.next = null;
            current.next = node;
            current = current.next;
        }

        return preHead.next;
    }

}