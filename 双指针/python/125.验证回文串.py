#
# @lc app=leetcode.cn id=125 lang=python3
#
# [125] 验证回文串
#

# @lc code=start
class Solution:
    def isPalindrome(self, s: str) -> bool:
        if s == None or len(s) == 0:
            return True;

        s = s.lower()
        left, right = 0, len(s) - 1
        while left < right:
            while left < right and self.isValidChar(s[left]) is False:
                left = left + 1
            while left < right and self.isValidChar(s[right]) is False:
                right = right - 1
            if s[left] != s[right]:
                return False
            left = left + 1
            right = right - 1
        return True
    
    def isValidChar(self, c: str) -> bool:
        if (c >= "a" and c <= "z") or (c >= "0" and c <= "9"):
            return True
            
        return False
# @lc code=end

