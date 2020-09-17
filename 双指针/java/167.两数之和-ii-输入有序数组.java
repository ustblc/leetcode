/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] res = new int[2];
        while (true) {
            int curSum = numbers[left] + numbers[right];
            if (curRes > target) {
                right--;
            }
            else if (curRes < target) {
                left++;
            }
            else {
                res[0] = left + 1;
                res[1] = right + 1; 
                return res;
            }
        }
    }
}
// @lc code=end

