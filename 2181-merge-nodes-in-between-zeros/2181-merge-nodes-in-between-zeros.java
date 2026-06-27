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
    public ListNode mergeNodes(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode curr = head.next;
        int sum = 0;
        while(curr!=null){
            
            if(curr.val!=0){
                sum+=curr.val;
            }
            if(curr.val==0){
                ListNode node = new ListNode(sum);
                temp.next = node;
                temp = temp.next;
                sum = 0;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}