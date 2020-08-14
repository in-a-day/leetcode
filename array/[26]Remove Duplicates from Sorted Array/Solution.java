class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length <= 1) return nums.length;

        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[curr]) {
                nums[++curr] = nums[i];
            }
        }
        return curr + 1;
    }
}
