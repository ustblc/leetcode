/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !isValidChar(s.charAt(left))) {
                left++;
            }
            while (left < right && !isValidChar(s.charAt(right))) {
                right--;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isValidChar(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
            return true;
        }
        return false;
    }
}
// @lc code=end

