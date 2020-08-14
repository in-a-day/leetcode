class Solution {
    public int firstMissingPositive(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] <= nums.length && nums[i] > 0 && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) return i + 1;
        }

        // 缺少的是len + 1, nums中的数从1到len一个不少
        return nums.length + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int useExtraSpace(int[] nums) {
        if (nums == null || nums.length == 0) return 1;
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            if (num > 0 && num < nums.length) s.add(num);
        }

        if (!s.contains(1)) return 1;

        int res = Integer.MIN_VALUE;
        for (int num : nums) {
            // num + 1 > 0 防止int类型溢出
            if (num > 0 && !s.contains(num + 1) && num + 1 > 0) {
                res = res == Integer.MIN_VALUE ?
                        num + 1 : Math.min(res, num + 1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {7, 8, 9, 10};
        int[] c = new int[]{3,4,-1,1};
        int[] d = new int[]{1,2,3,10,2147483647,9};
        int[] e = new int[]{2};
    }

}
