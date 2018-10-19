/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {    
                
        ListNode result = new ListNode(-1);
        ListNode node = result;
        ListNode n1 = l1;
        ListNode n2 = l2;
        
        int carryDigit = 0;
        while(true) {
            if(n1 == null && n2 == null) {
                if(carryDigit == 1) {
                    node.next = new ListNode(1);
                }
                break;
            }

            int temp = (n1 == null ? 0 : n1.val) + (n2 == null ? 0 : n2.val) + carryDigit;
            node.next = new ListNode(temp % 10);
            carryDigit = temp < 10 ? 0 : 1;
            
            node = node.next;
            n1 = n1 == null ? null : n1.next;
            n2 = n2 == null ? null : n2.next;
        }

		return result.next;
    }
}
