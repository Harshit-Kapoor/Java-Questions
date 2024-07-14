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
    public ListNode reverseList(ListNode llist) {
        
        ListNode temp = llist;

        ListNode prev = null;
        ListNode curr = temp;

        while(curr != null) {
            ListNode currP1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currP1;
        }

        return prev;
        
    }
}