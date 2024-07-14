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
    public ListNode middleNode(ListNode head) {
        
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null) {      // if anyone becomes false exit (fast.next for odd len and f.next.next for even len)
            fast = fast.next.next;
            slow = slow.next;            
        }
        
        return slow;
        
    }
}