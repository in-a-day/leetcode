package club.margay;

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res = nums[0], sum = nums[0];
        // 若 sum + nums[i] > res, 则sum继续累加, 否则sum = nums[i] , 同时若res < sum, 更新res
        // 实际上可以写出递归数组, 数组保存每次循环的最大值
        // int[] dp = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            // dp[i] = nums[i] + Math.max(dp[i - 1], 0);

            sum = Math.max(sum + nums[i], nums[i]);
            res = Math.max(res, sum);
        }
        return res;
    }
}
