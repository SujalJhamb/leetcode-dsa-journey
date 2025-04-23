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
        ListNode temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        int res = cnt - N;
        if (res == 0) {
            ListNode newHead = head.next;
            head.next = null;
            return newHead;
        }
        
        temp = head;
        while (res > 1) {
            temp = temp.next;
            res--;
        }
        ListNode delNode = temp.next;
        temp.next = temp.next.next;
        delNode.next = null;
        return head;
    }
}