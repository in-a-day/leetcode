class Solution {
    public void rotate(int[] nums, int k) {
        int m = k % nums.length;
        if (m == 0 || m == nums.length) return;
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            swap(nums, i, j);
        }
        for (int a = m - 1, b = 0; a > b; a--, b++) {
            swap(nums, a, b);
        }
        for (int a = m, b = nums.length - 1; a < b; a++, b--) {
            swap(nums, a, b);
        }
    }

    private void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
