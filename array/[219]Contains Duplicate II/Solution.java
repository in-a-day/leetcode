class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                if (i - m.get(nums[i]) <= k) return true;
            }
            m.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = new int[]{1, 2, 3, 1};
        int[] b = new int[]{1, 0, 1, 1};
        int[] c = new int[]{1, 2, 3, 1, 2, 3};
        System.out.println(s.containsNearbyDuplicate(a, 3));
        System.out.println(s.containsNearbyDuplicate(b, 1));
        System.out.println(s.containsNearbyDuplicate(c, 2));
    }
}