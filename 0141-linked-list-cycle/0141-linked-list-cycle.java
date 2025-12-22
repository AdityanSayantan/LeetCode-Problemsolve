/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//  🐇0ms 100% 🐢||✅Step By Step Explained with Visualization. Easiest to understand. Java, C++, Python,

// Ashok Varma
// 50 Days Badge 2024
// 38265
// Mar 19, 2025
// Linked List
// Two Pointers
// Python
// C++

// 4+
// ✅IF YOU LIKE THIS SOLUTION, PLEASE UPVOTE AT THE END😊 ✅

// Intuition💡:
// Use two pointers : slow (tortoise 🐢 ) and fast (hare 🐇 ). The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. If there's a cycle, the fast pointer will eventually meet the slow pointer inside the cycle. If there's no cycle, the fast pointer will reach the end of the list.

// Floyd’s Cycle-Finding Algorithm // fast slow approach // 2 pointers
// tortoise and the hare algorithm (Tortoise and Hare)
// For More Visualization for Beginner (Floyd's Tortoise and Hare Explained)
// Approach :
// 1 . Start both pointers at the head of the list.

// 2 . Move slow by 1 step and fast by 2 steps.

// 3 . If fast meets slow, a cycle exists.

// 4 . If fast reaches the end (null), no cycle exists.

// 🐢 moves 1 step, 🐇 moves 2 steps. If they meet, there's a cycle! 🎯

// ⏳Complexity Analysis
// Time complexity:O(n)
// Space complexity: O(1)
// Approach & Step-by-Step Visualization🔍:
// Example: list 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
// slow (🐢) and fast (🐇) are at node 1.
// image.png

// Iteration 1 :
// 1 . Initial State:

// 🐢(slow) moves to 2. slow=slow.next;

// 🐇(fast) moves to 3. fast=fast.next.next;

// 1 → 2 → 3 → 4 → 5 → 6
//    🐢  🐇
// image.png

// Iteration 2 :
// 🐢(slow) moves to 3. slow=slow.next;

// 🐇(fast) moves to 5. fast=fast.next.next;

// 1 → 2 → 3 → 4 → 5 → 6
//        🐢      🐇
// image.png

// Iteration 3 :
// 🐢(slow) moves to 4. slow=slow.next;

// 🐇(fast) moves to 3 (loops back if cycle exists). fast=fast.next.next;

// 1 → 2 → 3 → 4 → 5 → 6
//         🐇 🐢
// image.png

// Iteration 4 :
// 🐢(slow) moves to 5. slow=slow.next;

// 🐇(fast) moves to 5. fast=fast.next.next;

// 1 → 2 → 3 → 4 → 5 → 6   
//                🐇
//                🐢
// image.png

// 🐢 and 🐇 meet at 5 → Cycle Detected! 🎯

// Return true.

// if (slow == fast) {
//     return true; // Cycle detected
// }
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast  = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}