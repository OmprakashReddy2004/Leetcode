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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        int idxb = 0;
        while(idxb!=b+1){
            curr = curr.next;
            idxb++;
        }
        int idxa = 0;
        ListNode temp = list1;
        while(idxa!=a-1){
            temp = temp.next;
            idxa++;
        }

        temp.next = list2;
        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = curr;
        return list1;

    }
}