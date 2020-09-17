#
# @lc app=leetcode.cn id=876 lang=python3
#
# [876] 链表的中间结点
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def middleNode(self, head: ListNode) -> ListNode:
        fast, slow = head, head
        while True:
            if fast == None or fast.next == None:
                return slow
            fast = fast.next.next
            slow = slow.next
# @lc code=end

