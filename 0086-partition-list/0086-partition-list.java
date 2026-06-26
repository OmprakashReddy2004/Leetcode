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
    public ListNode partition(ListNode head, int x) {
        ListNode smallList = new ListNode(0);
        ListNode bigList = new ListNode(0);

        ListNode small = smallList;
        ListNode big = bigList;

        ListNode curr = head;

        while(curr!=null){
            if(curr.val < x){
                small.next = curr;
                small = small.next;
            }else{
                big.next = curr;
                big = big.next;
            }
            curr = curr.next;
        }
        small.next = bigList.next;
        big.next = null;

        return smallList.next;
    }
}