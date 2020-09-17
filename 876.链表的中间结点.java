/*
 * @lc app=leetcode.cn id=876 lang=java
 *
 * [876] 链表的中间结点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while (true) {
            if (fast == null || fast.next == null) {
                return slow;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
    }
}
// @lc code=end

