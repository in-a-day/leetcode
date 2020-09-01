import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum;
        for (int l = 0, r = numbers.length - 1; l < r;) {
            sum = numbers[l] + numbers[r];
            if (sum == target) return new int[]{l + 1, r + 1};
            else if (sum < target) l++;
            else r--;
        }
        return null;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = new int[]{2,7,11,15};
        Arrays.stream(s.twoSum(a, 9)).forEach(System.out::println);
    }
}
