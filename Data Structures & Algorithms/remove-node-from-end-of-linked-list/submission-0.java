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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int noOfNode = 0;
        ListNode temp = head;

        while (temp != null){
            noOfNode ++;
            temp = temp.next;

        }

        int deletedNode = noOfNode - n + 1;

        if (deletedNode == 1){
            return head.next;
        }

        temp = head;

        while (deletedNode > 2){
            temp = temp.next;
            deletedNode --;
        }

        temp.next = temp.next.next;
        return head;

    }
}
