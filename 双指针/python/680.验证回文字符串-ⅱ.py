#
# @lc app=leetcode.cn id=680 lang=python3
#
# [680] 验证回文字符串 Ⅱ
#

# @lc code=start
class Solution:
    def partValidPalindrome(self, s: str, left: int, right: int) -> bool:

            while left < right:
                if s[left] != s[right]:
                    return False
                left = left + 1
                right = right -1
            
            return True

    def validPalindrome(self, s: str) -> bool:
        left, right = 0, len(s) - 1
        while left < right:
            if s[left] != s[right]:
                break
            left = left + 1
            right = right - 1
        return self.partValidPalindrome(s, left + 1, right) or self.partValidPalindrome(s, left, right - 1)

# @lc code=end

