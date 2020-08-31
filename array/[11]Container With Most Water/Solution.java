class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            res = Math.max(res, Math.min(height[i], height[j]) * (j - i));
            if (height[i + 1] >= height[i]) i++;
            else j--;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {1,8,6,2,5,4,8,3,7};
        System.out.println(s.maxArea(a));
    }
}
