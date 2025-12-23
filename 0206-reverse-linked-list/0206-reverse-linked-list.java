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
        // Intially prev as node is empty
        ListNode prev = null;
        // node operation start from curr that is head
        ListNode curr = head;
        // untill curr become null loop is working 
        while(curr != null){
            // taking temporary node to curr next node
            ListNode temp = curr.next;
            // --> Indicating current next node(not the value) to the prev node
            curr.next = prev;
            // now assign the current value to the prev <--1 <--2 <--3......<--5
            prev = curr;
            // now the current node should be starts from  where the last temp node placed  
            curr = temp;
        }

       return prev;
    }
}