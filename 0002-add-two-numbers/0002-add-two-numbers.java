import java.util.LinkedList;
import java.math.BigInteger;
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder st1 = new StringBuilder();
        StringBuilder st2 = new StringBuilder();
        
        ListNode current1 = l1;
        while (current1 != null) {
            st1.append(current1.val);
            current1 = current1.next;
        }
        
        ListNode current2 = l2;
        while (current2 != null) {
            st2.append(current2.val);
            current2 = current2.next;
        }
        
        st1.reverse();
        st2.reverse();
        
        
        BigInteger num1 = new BigInteger(st1.toString());
        BigInteger num2 = new BigInteger(st2.toString());
        
        
        BigInteger sum = num1.add(num2);
        
        
        String sumStr = sum.toString();
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
         
        for (int i = sumStr.length() - 1; i >= 0; i--) {
            int digit = sumStr.charAt(i) - '0';
            current.next = new ListNode(digit);
            current = current.next;
        }
        
        return dummy.next;
    }
}
