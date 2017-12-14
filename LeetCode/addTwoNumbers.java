/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {      
        if (l1 == null && l2 == null) return null;

        ListNode head = new ListNode((l1.val + l2.val) % 10);
        ListNode node = head;
        int carryOver = (l1.val + l2.val) / 10;
        
        while(carryOver > 0 || l1 != null && l1.next != null || l2 != null && l2.next != null) {
            int val1 = l1 != null && l1.next != null ? l1.next.val : 0;
            int val2 = l2 != null && l2.next != null ? l2.next.val : 0;
            
            node.next = new ListNode((val1 + val2 + carryOver) % 10);
            carryOver = (val1 + val2 + carryOver) / 10;
            
            node = node.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        
        return head;
    }
}