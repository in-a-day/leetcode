class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int curr = 0, flag = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[curr] != nums[i]) {
                nums[++curr] = nums[i];
                flag = 0;
            } else {
                if (flag++ < 1) nums[++curr] = nums[i];
            }
        }
        return curr + 1;
    }
}
