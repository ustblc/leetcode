#
# @lc app=leetcode.cn id=142 lang=python3
#
# [142] 环形链表 II
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        """
        # set
        nodeSet = set()
        while head:
            nodeSet.add(head)
            head = head.next
            if nodeSet.__contains__(head):
                return head
        return None
        """
        # double pointer 
        fast, slow = head, head
        while True:
            if fast == None or fast.next == None:
                return None
            fast = fast.next.next
            slow = slow.next
            if slow == fast:
                break
        
        slow = head
        while slow != fast:
            fast = fast.next
            slow = slow.next
        return slow

# @lc code=end

