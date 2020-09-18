/*
 * @lc app=leetcode.cn id=633 lang=java
 *
 * [633] 平方数之和
 */

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
        int left, right, fisrtValue, secondValue;
        left = 0;
        right = (int)Math.sqrt(c);
        while (left <= right) {
            fisrtValue = left * left;
            secondValue = right * right;
            //这两个加起来会有可能溢出，所以最好使用减法
            if (c - secondValue < fisrtValue) {
                right--;
            }
            else if (c - secondValue > fisrtValue) {
                left++;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

