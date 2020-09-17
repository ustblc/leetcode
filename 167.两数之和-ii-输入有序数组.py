#
# @lc app=leetcode.cn id=167 lang=python3
#
# [167] 两数之和 II - 输入有序数组
#

# @lc code=start
class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0
        right = len(numbers) - 1
        res = []
        while left < right:
            curSum = numbers[left] + numbers[right] 
            if curSum > target:
                right = right - 1
            elif curSum < target:
                left = left + 1
            else:
                res.append(left + 1)
                res.append(right + 1)
                return res


# @lc code=end

