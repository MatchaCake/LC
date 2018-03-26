/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        else if (l1 == null) return l2;
        else if (l2 == null) return l1;
        ListNode head = new ListNode(0);
        ListNode pre = head;
        while (!(l1 == null && l2 == null)) {
            ListNode cur = new ListNode(0);
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    cur = l1;
                    l1 = l1.next;
                }
                else {
                    cur = l2;
                    l2 = l2.next;
                }
            }
            else if (l1 == null) {
                cur = l2;
                l2 = l2.next;
            }
            else {
                cur = l1;
                l1 = l1.next;
            }
            pre.next = cur;
            pre = cur;
        }
        return head.next;
    }
}