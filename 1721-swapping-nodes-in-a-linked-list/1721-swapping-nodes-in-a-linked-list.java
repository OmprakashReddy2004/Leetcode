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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode slow = dummy;
        ListNode fast = dummy;


        for(int i=0;i<k;i++){
            fast = fast.next;
            curr = curr.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        int temp = curr.val;
        curr.val = slow.val;
        slow.val = temp;

        return dummy.next;
        
    }
}