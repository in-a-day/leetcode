class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1, k = nums.length - 1; j < k;) {
                int temp = nums[i] + nums[j] + nums[k];
                res = Math.abs(temp - target) < Math.abs(res - target) ? temp : res;
                if (temp - target > 0) k--;
                else if (temp - target < 0) j++;
                else return temp;
            }
        }
        return res;
    }
}
