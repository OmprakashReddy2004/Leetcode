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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        
        ListNode first = head;
        ListNode second = head.next;
        ListNode evenHead = head.next;

        while(first.next!=null && second.next!=null){
            first.next = first.next.next;
            second.next = second.next.next;
            first = first.next;
            second = second.next;
        }
        

         first.next = evenHead;
         return head;



    }
}