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
    public ListNode removeNthFromEnd(ListNode head, int N) {
        if (head == null || head.next == null) return null;
        ListNode fast = head;
        for (int i = 0; i < N; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            ListNode newHead = head.next;
            head.next = null;
            return newHead;
        }
        ListNode slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
    
        ListNode delNode = slow.next;
        slow.next = slow.next.next;
        delNode.next = null;
        return head;
    }
}