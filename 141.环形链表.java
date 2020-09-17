import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
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
public class Solution {
    public boolean hasCycle(ListNode head) {
        // method_1:double_pointer
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
        /*method_2:hash_set
        Set<ListNode> nodeSet = new HashSet<>();
        while (head != null) {
            nodeSet.add(head);
            head = head.next;
            if (nodeSet.contains(head) == true) {
                return true;
            }
        }
        return false;
        */
        /*method_:骚操作（节点数目范围给定）
        int maxStep = 10001;
        int curStep = 0;
        while (head != null) {
            curStep += 1;
            head = head.next;
            if (curStep >= maxStep) {
                return true; 
            }
        }
        return false;
        */

    }
}
// @lc code=end

