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
    public void reorderList(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode mid = slow.next;
        slow.next = null;

        ListNode middle = reverseLinkedList(mid);
        ListNode temp = head;

        while( middle  != null){
            ListNode n = temp.next;
            temp.next = middle;
            temp = n;
            ListNode m = middle.next;
            middle.next = temp;
            middle = m;
        }

      
        
    }

    private ListNode reverseLinkedList(ListNode head){
            if (head == null || head.next == null){
                return head;
            }
            ListNode last = reverseLinkedList(head.next);
            head.next.next = head;  
            head.next = null;
            return last;

    }
}
