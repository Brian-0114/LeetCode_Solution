/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode p = dummy;
        while(p.next != null && p.next.next != null){
            ListNode l1 = p.next, l2 = p.next.next;
            
            p.next = l2;
            l1.next = l2.next;
            l2.next = l1;
            
            p = l1;
        }
        
        return dummy.next;
    }
}