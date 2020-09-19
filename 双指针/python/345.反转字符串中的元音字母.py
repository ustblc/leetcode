#
# @lc app=leetcode.cn id=345 lang=python3
#
# [345] 反转字符串中的元音字母
#

# @lc code=start
class Solution:
    def reverseVowels(self, s: str) -> str:
        vowel = list("aeiouAEIOU")
        s_list = list(s)
        left, right = 0, len(s) - 1

        while left < right:
            while left < right and s_list[left] not in vowel:
               left = left + 1
               
            while left < right and s_list[right] not in vowel:
                right = right - 1

            s_list[left], s_list[right] = s_list[right], s_list[left]
            left = left + 1
            right = right - 1

        return ''.join(s_list)

# @lc code=end

