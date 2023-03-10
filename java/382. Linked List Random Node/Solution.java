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

    private Random random = new Random();
    private ListNode head;
    private int size = 0;

    public Solution(ListNode head) {
        ListNode current = head;
        this.head = head;
        while(current != null) {
            current = current.next;
            this.size++;
        }
    }

    public int getRandom() {
        int r = random.nextInt(size);

        ListNode current = head;
        for (int i = 0; i < r; i++) {
            current = current.next;
        }
        return current.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */