import math
#
# @lc app=leetcode.cn id=633 lang=python3
#
# [633] 平方数之和
#

# @lc code=start
class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        left, right = 0, int(math.sqrt(c))
        while left <= right:
            firstValue = left * left
            secondValue = right * right
            # 加法可能会造成数据溢出
            if c - firstValue > secondValue:
                left = left + 1
            elif c - firstValue < secondValue:
                right = right - 1
            else:
                return True
        
        return False
# @lc code=end

