/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int countA = 0;
        int countB = 0;
        while(a!=null){
            countA++;
            a= a.next;
        }
        while(b!=null){
            countB++;
            b = b.next;
        }
        int len = Math.abs(countA - countB);
        if(countA > countB){
            while(len!=0){
                headA = headA.next;
                len--;
            }
        }else{
            while(len!=0){
                headB = headB.next;
                len--;
            }
        }
        while(headA!=null && headB!=null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}