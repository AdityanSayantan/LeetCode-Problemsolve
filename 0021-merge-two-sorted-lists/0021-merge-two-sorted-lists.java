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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
          // Dummy node to simplify handling the head of the new list
        ListNode dummy = new ListNode();

        // Pointer used to build the merged list
        ListNode curr = dummy;

        // Traverse both lists while both have nodes
        while(list1 != null && list2 != null)
        {
            // Pick the smaller value to maintain sorted order
            if(list1.val < list2.val)
            {
                curr.next = list1;     // attach list1's node
                list1 = list1.next;    // move list1 forward
            }
            else
            {
                curr.next = list2;     // attach list2's node
                list2 = list2.next;    // move list2 forward
            }
            curr = curr.next;          // move curr forward
        }

        // At least one list is now empty
        // Attach whichever list still has remaining nodes
        if(list1 == null)
        {
            curr.next = list2;
        }
        else
        {
            curr.next = list1;
        }

        // Return the merged list starting after the dummy node
        return dummy.next;
    }
}