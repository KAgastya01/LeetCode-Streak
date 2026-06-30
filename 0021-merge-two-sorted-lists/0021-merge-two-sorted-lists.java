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
        // Create a dummy node to act as the anchor for our new sorted list
        ListNode dummy = new ListNode(-1);
        // This pointer will move along as we build the new list
        ListNode current = dummy;

        // Loop while both lists still have blocks left to look at
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1; // Connect the smaller block
                list1 = list1.next;   // Move to the next block in list1
            } else {
                current.next = list2; // Connect the smaller block
                list2 = list2.next;   // Move to the next block in list2
            }
            current = current.next;   // Move our main pointer forward
        }

        // If one line ran out of blocks, just attach the rest of the other line
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the actual head of the sorted list (skipping the dummy)
        return dummy.next;
    }
}