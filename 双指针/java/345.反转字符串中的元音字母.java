/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        int left = 0;
        int right = s.length() - 1;

        char[] chars = s.toCharArray(); 
        String vowel = "aeiouAEIOU";

        while (left < right) {
           while (left < right && !vowel.contains(chars[left] + "")) {
               left++;
           }
           while (left < right && !vowel.contains(chars[right] + "")) {
               right-- ;
           }
           swapChar(chars, left, right);
           left++;
           right--;
        }
        return new String(chars);
    }
    
    public void swapChar(char[] chars, int  left, int right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
    }
}
// @lc code=end

