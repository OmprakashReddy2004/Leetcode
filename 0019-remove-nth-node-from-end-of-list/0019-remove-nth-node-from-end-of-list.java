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
         
        int count = 1;
        ListNode temp = head;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
         int pos = count - n ;
        if(pos==0){
            return head.next;
        }
         temp = head;
         while(pos>1){
            temp = temp.next;
            pos--;
         }
         if(temp.next!=null){
         temp.next = temp.next.next; 
        }
         return head;
    }
}