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
        ListNode temp = head;
        if(head==null || head.next==null){
            return head;
        }
        if(head.next.next==null){
            temp = head.next;
            temp.next = head;
            head.next = null;
            return temp;
        }
        ListNode curr = null;
        ListNode h1 = head;
        ListNode h2 = head.next;
        while(h2!=null){
            h1.next = curr;
            curr = h1;
            h1 = h2;
            h2 = h2.next;
        }
         h1.next = curr;
        return h1;
    }
}