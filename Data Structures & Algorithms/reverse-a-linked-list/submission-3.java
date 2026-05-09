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
    public ListNode reverseList(ListNode head) {

       //recursive solution 
       
    /*
        if (head == null || head.next == null){
            return head;
        }

         ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
        */

        // iterative solution

        if (head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr= temp;
        }

        return prev;
    }
}
