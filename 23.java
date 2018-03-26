/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        ListNode head = new ListNode(0);
        ListNode pre = head;
            PriorityQueue<ListNode> pq = new PriorityQueue<ListNode> (lists.length, new Comparator<ListNode>() {
                @Override
                public int compare(ListNode l1, ListNode l2) {
                    if (l1.val < l2.val) return -1;
                    else if (l1.val == l2.val) return 0;
                    else return 1;
                }
            });
       for (ListNode node : lists) {
           if (node != null) pq.add(node);
       }
       while (!pq.isEmpty()) {
           ListNode cur = pq.poll();
           pre.next = cur;
           pre = cur;
           
           if (cur.next != null) pq.add(cur.next);
       }
       return head.next;
    }
}