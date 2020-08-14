class Solution {
    public int searchInsert(int[] nums, int target) {
        // binary search
        if (nums == null || nums.length == 0) return 0;
        int low = 0, high = nums.length - 1, mid = 0;
        if (nums[low] > target) return 0;
        if (nums[high] < target) return high + 1;
        while (low <= high) {
            mid = low + high >> 1;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return nums[mid] < target ? mid + 1 : mid;
    }
}
